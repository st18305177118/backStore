package com.shi.bookstore.controller;

import com.shi.bookstore.entity.Book;
import com.shi.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/5/25 15:44
 */
@RestController
@RequestMapping("/book")
@CrossOrigin
public class BookController {
    @Autowired
    private BookService bookService;
    //RequestParam
    @PostMapping("/findLike")
    public List<Book> findLike(@RequestBody Book book){
        List list =bookService.findLikeBookNameAndAuthor(book);
        return list;
    }


}
