package com.borrow.entity;

import entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import entity.User;

import java.util.List;

@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}