package kr.ac.kopo.janrendel11.bookmarket.repository;

import kr.ac.kopo.janrendel11.bookmarket.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList(); // 도서 목록 가져오는 메서드 선언
    Book getBookById(String bookId) throws IllegalAccessException;
}
