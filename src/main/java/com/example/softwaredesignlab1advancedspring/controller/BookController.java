package com.example.softwaredesignlab1advancedspring.controller;

import com.example.softwaredesignlab1advancedspring.dto.BookMaskedDTO;
import com.example.softwaredesignlab1advancedspring.model.Book;
import com.example.softwaredesignlab1advancedspring.repository.BookRepository;
import com.example.softwaredesignlab1advancedspring.repository.InMemoryBookRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final InMemoryBookRepository repo;

    public BookController(InMemoryBookRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/{id}")
    public BookMaskedDTO getBookById(
            @PathVariable int id,
            @RequestParam(defaultValue = "31") int mask // по умолчанию все поля
    ) {

        return new BookMaskedDTO(repo.findById(id), mask);
    }
}