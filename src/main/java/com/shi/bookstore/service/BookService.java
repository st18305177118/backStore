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
    /*删除书籍*/
    void deleteBook(long id);
    /*显示全部书籍*/
    List<Book> findAllBook();
    /*更新书籍*/
    Book updateBook(Book book);
}
