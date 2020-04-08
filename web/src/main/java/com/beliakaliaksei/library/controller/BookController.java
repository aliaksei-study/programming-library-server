package com.beliakaliaksei.library.controller;


import com.beliakaliaksei.library.dto.AddressDto;
import com.beliakaliaksei.library.dto.BookDto;
import com.beliakaliaksei.library.dto.PublisherDto;
import com.beliakaliaksei.library.entity.Book;
import com.beliakaliaksei.library.service.IBookService;
import com.beliakaliaksei.library.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BookController {
    private final IBookService bookService;

    @Autowired
    public BookController(IBookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public List<Book> showBooks() {
        return bookService.getAllBook();
    }

    @PostMapping("/add")
    public void saveBook(@Valid @RequestBody BookDto bookDto) {
        bookService.addNewBook(Mapper.map(bookDto, Book.class));
    }
}
