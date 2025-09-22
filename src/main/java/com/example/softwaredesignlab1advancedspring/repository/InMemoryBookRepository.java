package com.example.softwaredesignlab1advancedspring.repository;

import com.example.softwaredesignlab1advancedspring.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBookRepository implements BookRepository {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public List<Book> findByTitle(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .toList();
    }

    public Book findById(int id) {
        return books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Book> getAll() {
        return books;
    }
}

