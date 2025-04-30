package kr.ac.kopo.janrendel11.bookmarket.repository;

import kr.ac.kopo.janrendel11.bookmarket.domain.Book;

import java.util.*;

public interface BookRepository {
    List<Book> getAllBookList();
    Book getBookById(String bookId);
    List<Book> getBooksByCategory(String category);

    List<Book> getBookListByCategory(String category);

    Set<Book> getBookListByFilter(Map<String, List<String>> filter);
}
