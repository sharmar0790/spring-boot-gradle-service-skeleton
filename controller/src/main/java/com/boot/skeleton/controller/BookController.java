package com.boot.skeleton.controller;

import com.boot.skeleton.BookService;
import com.boot.skeleton.Books;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.boot.skeleton.constants.ApplicationConstants.ALL_EP;
import static com.boot.skeleton.constants.ApplicationConstants.API_BOOK;
import static com.boot.skeleton.constants.ApplicationConstants.DELETE_EP;
import static com.boot.skeleton.constants.ApplicationConstants.SAVE_EP;


@RestController
@RequestMapping(API_BOOK)
public class BookController {

    private final static Logger LOG = LoggerFactory.getLogger(BookController.class);

    @Autowired
    BookService bookService;

    @PostMapping(SAVE_EP)
    public String saveBooks(@RequestBody Books books) {
        try {
            bookService.save(books);
        } catch (Exception ex) {
            LOG.error("Exception caught while saving books {} {}", ex, books);
            return "Error while saving Books";
        }
        return "Books Saved Successfully";
    }

    @GetMapping(ALL_EP)
    public List<Books> getAllBooks() {
        return bookService.findAll();
    }


    @DeleteMapping(DELETE_EP + "/{id}")
    public String deleteUserById(@PathVariable("id") Integer id) {
        try {
            bookService.delete(id);
        } catch (Exception ex) {
            LOG.error("Exception caught while deleting books by id : {} {}", id, ex);
            return "Error while deleting book";
        }
        return "Books Deleted Successfully";
    }
}

