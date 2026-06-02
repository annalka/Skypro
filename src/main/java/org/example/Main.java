package org.example;

public class Main {
        public static void main(String[] args) {

            Author author1 = new Author("Лев", "Толстой");
            Author author2 = new Author("Фёдор", "Достоевский");

            Book book1 = new Book("Война и мир", author1, 1869);
            Book book2 = new Book("Преступление и наказание", author2, 1866);

            System.out.println("До изменения года публикации:");
            System.out.println(book1.getTitle() + " (" + book1.getAuthor().getFirstName() +
                    " " + book1.getAuthor().getLastName() + ") — " + book1.getPublicationYear());
            System.out.println(book2.getTitle() + " (" + book2.getAuthor().getFirstName() +
                    " " + book2.getAuthor().getLastName() + ") — " + book2.getPublicationYear());

            book1.setPublicationYear(1870);

            System.out.println("\nПосле изменения года публикации:");
            System.out.println(book1.getTitle() + " (" + book1.getAuthor().getFirstName() +
                    " " + book1.getAuthor().getLastName() + ") — " + book1.getPublicationYear());
        }
    }