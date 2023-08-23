package com.graphqljava.tutorial.bookDetails;

import java.util.Arrays;
import java.util.List;

public class Book {

    private String id;
    private String name;
    private int pageCount;
    private List<String> authorId;

    public Book(String id, String name, int pageCount, List<String> authorId) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.authorId = authorId;
    }

    private static List<Book> books = Arrays.asList(
            new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, Arrays.asList("author-1", "author-2")),
            new Book("book-2", "Moby Dick", 635, Arrays.asList("author-2")),
            new Book("book-3", "Interview with the vampire", 371,  Arrays.asList("author-3"))
    );

    public static Book getById(String id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public List<String> getAuthorId() {
        return authorId;
    }
}