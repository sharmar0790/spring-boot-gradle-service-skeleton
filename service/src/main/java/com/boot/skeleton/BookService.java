package com.boot.skeleton;

import java.util.List;

public interface BookService {

    void save(final Books books);

    List<Books> findAll();

    Books findById(final Integer id);

    void update(final Books books);

    void delete(final Integer id);

}
