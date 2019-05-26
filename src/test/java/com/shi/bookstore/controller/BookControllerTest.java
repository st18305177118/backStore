package com.shi.bookstore.controller;
import com.shi.bookstore.entity.Book;
import com.shi.bookstore.repository.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookControllerTest {
    @Autowired
    private BookRepository bookRepository;
    @Test
    public void findLike() {
        Book book = new Book();
        book.setBookName("12");
        List list = bookRepository.findLikeAuthorAndbookName(book.getBookName());
        System.out.println(list);
    }
}