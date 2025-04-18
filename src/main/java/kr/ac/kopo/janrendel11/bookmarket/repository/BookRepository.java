package kr.ac.kopo.janrendel11.bookmarket.repository;

import kr.ac.kopo.janrendel11.bookmarket.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
    Book getBookById(String bookId);
    List<Book> getBookListByCategory(String category);
}
