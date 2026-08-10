package org.skypro.skyshop.product;

public class Article implements Searchable {
    private String name;
    private String content;

    public Article(String name, String content) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя статьи не может быть пустым");
        }
        this.name = name;
        this.content = content;
    }

    public Article(String name) {
        this(name, "");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSearchTerm() {
        return name + " " + content;
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;

        Article article = (Article) o;
        return name.equals(article.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Article{name='" + name + "', content='" + content + "'}";
    }
}
