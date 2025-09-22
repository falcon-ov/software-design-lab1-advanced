package com.example.softwaredesignlab1advancedspring.dto;

import com.example.softwaredesignlab1advancedspring.model.Book;
import com.example.softwaredesignlab1advancedspring.util.BookFieldMask;
import com.example.softwaredesignlab1advancedspring.util.MaskUtils;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookMaskedDTO {
    public Integer id;
    public String title;
    public Float price;
    public Book.Genre genre;
    public Boolean isAvailable;

    public BookMaskedDTO(Book book, int mask) {
        if (MaskUtils.intersectMasks(mask, BookFieldMask.ID) != 0) {
            this.id = book.getId();
        }
        if (MaskUtils.intersectMasks(mask, BookFieldMask.TITLE) != 0) {
            this.title = book.getTitle();
        }
        if (MaskUtils.intersectMasks(mask, BookFieldMask.PRICE) != 0) {
            this.price = book.getPrice();
        }
        if (MaskUtils.intersectMasks(mask, BookFieldMask.GENRE) != 0) {
            this.genre = book.getGenre();
        }
        if (MaskUtils.intersectMasks(mask, BookFieldMask.AVAILABILITY) != 0) {
            this.isAvailable = book.isAvailable();
        }
    }
}
