package com.book.service.impl;

import entity.Book;
import com.book.mapper.BookMapper;
import com.book.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper mapper;

    @Override
    public Book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}
