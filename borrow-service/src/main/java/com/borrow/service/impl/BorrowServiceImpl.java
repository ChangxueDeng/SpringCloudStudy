package com.borrow.service.impl;

import com.borrow.entity.UserBorrowDetail;
import com.borrow.mapper.BorrowMapper;
import com.borrow.service.BorrowService;
import com.borrow.service.client.BookClient;
import com.borrow.service.client.UserClient;
import entity.Book;
import entity.Borrow;
import entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowServiceImpl implements BorrowService {
    @Resource
    BorrowMapper mapper;
    @Resource
    UserClient userClient;
    @Resource
    BookClient bookClient;
    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(int uid) {
        List<Borrow> borrows = mapper.getBorrowsByUid(uid);
        //从其他微服务获取
//        RestTemplate template = new RestTemplate();
        User user = userClient.getUserById(uid);
        List<Book> books = borrows.stream().map(b-> bookClient.getBookById(b.getBid())).collect(Collectors.toList());
        return new UserBorrowDetail(user, books);
    }
}
