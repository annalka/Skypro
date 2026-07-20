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
}

