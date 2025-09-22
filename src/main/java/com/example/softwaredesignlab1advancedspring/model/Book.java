package com.example.softwaredesignlab1advancedspring.model;

// Domain Model: класс Book инкапсулирует данные о книге
public class Book {

    // Конструктор для инициализации всех полей
    public Book(int id, String title, float price, Genre genre, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    // Enum — один из типов поля, как требует задание
    public enum Genre {FICTION, NONFICTION, SCIENCE, HISTORY}

    // Приватные поля — демонстрация инкапсуляции
    private int id;               // int
    private String title;         // string
    private float price;          // float
    private Genre genre;          // enum
    private boolean isAvailable;  // boolean — дополнительное поле

    // Геттеры и сеттеры — обеспечивают доступ к инкапсулированным данным
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
