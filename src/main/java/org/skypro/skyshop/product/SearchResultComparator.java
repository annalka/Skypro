package org.skypro.skyshop.product;

import java.util.Comparator;

public class SearchResultComparator implements Comparator<Searchable> {
    @Override
    public int compare(Searchable o1, Searchable o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();

        int lengthDiff = Integer.compare(name2.length(), name1.length());
        if (lengthDiff != 0) {
            return lengthDiff;
        }

        return name1.compareTo(name2);
    }
}
