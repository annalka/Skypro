package org.example;
import java.util.Arrays;
import java.util.Objects;

class Product {
    private int id;
    private String name;
    private int price;
    private String category;

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Товар[артикул=" + id +
                ", название=" + name +
                ", цена=" + price +
                ", категория=" + category + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Product other = (Product) obj;
        return this.id == other.id &&
                Objects.equals(this.category, other.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category);
    }
}