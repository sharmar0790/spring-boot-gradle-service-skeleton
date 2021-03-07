package com.boot.skeleton.impl;

import com.boot.skeleton.BookService;
import com.boot.skeleton.Books;
import com.boot.skeleton.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BooksRepository booksRepository;

    @Override
    public void save(final Books books) {
        booksRepository.save(books);
    }

    @Override
    public List<Books> findAll() {
        return booksRepository.findAll();
    }

    @Override
    public Books findById(final Integer id) {
        return booksRepository.findById(id);
    }

    @Override
    public void update(final Books books) {
        booksRepository.update(books);
    }

    @Override
    public void delete(final Integer id) {
        booksRepository.delete(id);
    }
}
