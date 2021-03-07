package com.boot.skeleton;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BooksRepositoryImpl implements BooksRepository {

    private static Map<Integer, Books> testingMap = new HashMap<>();

    @Override
    public void save(final Books book) {

        testingMap.put(book.getId(), book);
    }

    @Override
    public List<Books> findAll() {
        List<Books> rlist = new ArrayList<>();
        testingMap.forEach((k, v) -> rlist.add(v));

        return rlist;
    }

    @Override
    public Books findById(final Integer id) {
        return (Books) testingMap.get(id);
    }

    @Override
    public void update(final Books books) {
        save(books);
    }

    @Override
    public void delete(final Integer id) {
        testingMap.remove(id);
    }
}
