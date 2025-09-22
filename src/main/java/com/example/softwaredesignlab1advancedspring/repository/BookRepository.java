package com.example.softwaredesignlab1advancedspring.repository;

import com.example.softwaredesignlab1advancedspring.model.Book;

import java.util.List;

public interface BookRepository {
    void add(Book book);
    List<Book> findByTitle(String title);
    Book findById(int id);
    List<Book> getAll();

}
