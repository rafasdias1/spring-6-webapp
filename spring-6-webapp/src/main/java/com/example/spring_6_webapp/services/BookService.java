package com.example.spring_6_webapp.services;

import com.example.spring_6_webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
