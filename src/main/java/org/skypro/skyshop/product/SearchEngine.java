package org.skypro.skyshop.product;

public class SearchEngine {
    private final Searchable[] storage;
    private int size;

    public SearchEngine(int capacity) {
        storage = new Searchable[capacity];
        size = 0;
    }

    public void add(Searchable item) {
        if (size < storage.length) {
            storage[size] = item;
            size++;
        }
    }

    public Searchable[] search(String query) {

        Searchable[] result = new Searchable[5];

        int found = 0;

        for (int i = 0; i < size; i++) {
            Searchable item = storage[i];

            if (item != null && item.getSearchTerm().contains(query)) {
                result[found] = item;
                found++;
                if (found == 5) {
                    break;
                }
            }
        }

        return result;
    }

    public Searchable findBestMatch(String search) throws BestResultNotFound {
        if (search == null || search.isBlank()) {
            throw new BestResultNotFound("Поисковый запрос не может быть пустым или null.");
        }

        Searchable bestMatch = null;
        int maxCount = -1;

        for (int i = 0; i < size; i++) {
            Searchable item = storage[i];
            if (item != null) {
                String term = item.getSearchTerm();
                int count = countOccurrences(term, search);

                if (count > maxCount) {
                    maxCount = count;
                    bestMatch = item;
                }
            }
        }

        if (bestMatch == null || maxCount == 0) {
            throw new BestResultNotFound("Не найдено ни одного подходящего элемента для запроса: \"" + search + "\"");
        }

        return bestMatch;
    }

    private int countOccurrences(String text, String sub) {
        if (sub.isEmpty()) return 0;
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }
}
