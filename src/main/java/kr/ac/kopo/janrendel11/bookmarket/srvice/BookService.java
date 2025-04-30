package kr.ac.kopo.janrendel11.bookmarket.srvice;

import kr.ac.kopo.janrendel11.bookmarket.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.*;
@Service
public interface BookService {
    List<Book> getAllBookList();
    Book getBookById(String bookId);
    List<Book> getBookListByCategory(String category);
    Set<Book> getBookListByFilter(Map<String, List<String>> bookFilter);
}
