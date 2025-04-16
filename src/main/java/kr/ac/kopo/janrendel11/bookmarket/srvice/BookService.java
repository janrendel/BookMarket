package kr.ac.kopo.janrendel11.bookmarket.srvice;

import kr.ac.kopo.janrendel11.bookmarket.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getAllBookList();
    Book getBookById(String bookId);
}
