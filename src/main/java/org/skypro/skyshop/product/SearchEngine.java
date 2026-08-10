package org.skypro.skyshop.product;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SearchEngine {
    private final Set<Searchable> items = new HashSet<>();

    public void add(Searchable item) {
        items.add(item);
    }

    public Set<Searchable> search(String query) {
        if (query == null || query.isBlank()) {
            return new TreeSet<>(new SearchResultComparator());
        }

        String lowerQuery = query.toLowerCase();
        Set<Searchable> filtered = new HashSet<>();

        for (Searchable item : items) {
            if (item.getSearchTerm().toLowerCase().contains(lowerQuery)) {
                filtered.add(item);
            }
        }

        TreeSet<Searchable> sortedResults = new TreeSet<>(new SearchResultComparator());
        sortedResults.addAll(filtered);

        return sortedResults;
    }

    public Searchable findBestMatch(String query) throws BestResultNotFound {
        Set<Searchable> results = search(query);
        if (results.isEmpty()) {
            throw new BestResultNotFound("Ничего не найдено для запроса: " + query);
        }
        return results.iterator().next();
    }
}
