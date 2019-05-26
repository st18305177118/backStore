package com.shi.bookstore.repository;

import com.shi.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @auther shiTu
 * @date 2019/5/25 14:40
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    //根据书名和作者进行模糊查询
    @Query("select book from Book book where book.bookName like %?1%")
    List<Book> findLikeAuthorAndbookName(String bookName);
}
