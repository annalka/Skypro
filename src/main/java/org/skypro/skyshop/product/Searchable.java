package org.skypro.skyshop.product;

public interface Searchable {
    String getSearchTerm();
    String getContentType();
    String getName();

    // Ключевое слово default обязательно!
    default String getStringRepresentation() {
        return getName() + " — " + getContentType();
    }
}
