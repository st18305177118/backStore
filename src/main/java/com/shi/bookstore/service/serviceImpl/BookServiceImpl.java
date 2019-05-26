package com.shi.bookstore.service.serviceImpl;

import com.shi.bookstore.entity.Book;
import com.shi.bookstore.repository.BookRepository;
import com.shi.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/5/25 15:05
 */
@Service
public class BookServiceImpl implements BookService {
   @Autowired
   private BookRepository bookRepository;
    @Override
    public List<Book> findLikeBookNameAndAuthor(Book book) {
        return bookRepository.findLikeAuthorAndbookName(book.getBookName());
    }
}
