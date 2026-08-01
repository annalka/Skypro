package org.skypro.skyshop.product;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private final List<Searchable> storage;

    public SearchEngine() {
        this.storage = new ArrayList<>();
    }

    public void add(Searchable item) {
        storage.add(item);
    }

    public List<Searchable> search(String query) {
        List<Searchable> result = new ArrayList<>();

        for (Searchable item : storage) {
            if (item != null && item.getSearchTerm().contains(query)) {
                result.add(item);
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

        for (Searchable item : storage) {
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
