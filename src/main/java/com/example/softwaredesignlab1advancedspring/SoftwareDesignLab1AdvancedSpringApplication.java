package com.example.softwaredesignlab1advancedspring;

import com.example.softwaredesignlab1advancedspring.model.Book;
import com.example.softwaredesignlab1advancedspring.repository.InMemoryBookRepository;
import com.example.softwaredesignlab1advancedspring.util.BookFieldMask;
import com.example.softwaredesignlab1advancedspring.util.PrintHelper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoftwareDesignLab1AdvancedSpringApplication {
    @Bean
    public CommandLineRunner initBooks(InMemoryBookRepository repo) {
        return args -> {
            repo.add(new Book(1, "Java Basics", 29.99f, Book.Genre.SCIENCE, true));
            repo.add(new Book(2, "Java Basics", 69.99f, Book.Genre.FICTION, false));
            repo.add(new Book(3, "History of Rome", 19.99f, Book.Genre.HISTORY, false));
            int mask = BookFieldMask.TITLE | BookFieldMask.PRICE; // 2 | 4 = 6 (00010 | 00100 = 00110)


            for (Book book : repo.findByTitle("Java Basics")) {
                PrintHelper.print(book, mask);
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SoftwareDesignLab1AdvancedSpringApplication.class, args);
    }

}
