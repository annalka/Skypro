package org.skypro.skyshop.product;

public abstract class Product implements Searchable {
    private final String name;

    protected Product(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public abstract int getPrice();

    public boolean isSpecial() {
        return false;
    }

    @Override
    public String getSearchTerm() {
        return name;
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }
}
