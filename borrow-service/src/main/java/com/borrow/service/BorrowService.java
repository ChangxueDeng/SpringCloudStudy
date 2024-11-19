package com.borrow.service;

import com.borrow.entity.UserBorrowDetail;

import java.awt.print.Book;

public interface BorrowService {
    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}
