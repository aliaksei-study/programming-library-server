package com.beliakaliaksei.library.controller;

import com.beliakaliaksei.library.dto.BookKeeperDto;
import com.beliakaliaksei.library.entity.BookKeeper;
import com.beliakaliaksei.library.service.IBookKeeperService;
import com.beliakaliaksei.library.util.Mapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/book-keeper")
public class BookKeeperController {
    private IBookKeeperService bookKeeperService;

    public BookKeeperController(IBookKeeperService bookKeeperService) {
        this.bookKeeperService = bookKeeperService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void saveBookKeeper(BookKeeperDto bookKeeperDto) {
        System.out.println(Mapper.map(bookKeeperDto, BookKeeper.class));
    }
}