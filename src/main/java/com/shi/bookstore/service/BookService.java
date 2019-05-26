package com.shi.bookstore.service;

import com.shi.bookstore.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/5/25 14:57
 */
@Service
public interface BookService {
    /*模糊查询到的信息*/
    List<Book> findLikeBookNameAndAuthor(Book book);
}
