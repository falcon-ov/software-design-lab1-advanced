package com.example.softwaredesignlab1advancedspring.util;

import com.example.softwaredesignlab1advancedspring.model.Book;

public class PrintHelper {
    public static void print(Book book, int mask) {
        if ((mask & BookFieldMask.ID) != 0) {
            System.out.println("ID: " + book.getId());
        }
        if ((mask & BookFieldMask.TITLE) != 0) {
            System.out.println("Title: " + book.getTitle());
        }
        if ((mask & BookFieldMask.PRICE) != 0) {
            System.out.println("Price: " + book.getPrice());
        }
        if ((mask & BookFieldMask.GENRE) != 0) {
            System.out.println("Genre: " + book.getGenre());
        }
        if ((mask & BookFieldMask.AVAILABILITY) != 0) {
            System.out.println("Available: " + book.isAvailable());
        }
    }
}