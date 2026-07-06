package org.skypro.skyshop.product;

public abstract class Product {
    private final String name;

    protected Product(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название продукта не может быть пустым");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();

    public boolean isSpecial() {
        return false;
    }

    @Override
    public String toString() {
        // Базовый формат: имя продукта: цена
        return getName() + ": " + getPrice();
    }
}


