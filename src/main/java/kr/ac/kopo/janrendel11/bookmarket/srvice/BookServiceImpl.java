package kr.ac.kopo.janrendel11.bookmarket.srvice;

import kr.ac.kopo.janrendel11.bookmarket.domain.Book;
import kr.ac.kopo.janrendel11.bookmarket.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> getAllBookList() {
        return bookRepository.getAllBookList();
    }

    @Override
    public Book getBookById(String bookId) {
        Book book = bookRepository.getBookById(bookId);
        return book;
    }
    @Override
    public List<Book> getBookListByCategory(String category) {
        List<Book> booksByCategory = new ArrayList<>();
        for (Book book : booksByCategory) {
            if (book != null && book.getCategory() != null && book.getCategory().equals(category)) {
                booksByCategory.add(book);

            }
        }
        return booksByCategory;
    }


    @Override
    public Set<Book> getBookListByFilter(Map<String, List<String>> filter) {
        Set<Book> booksByFilter = bookRepository.getBookListByFilter(filter);
        return booksByFilter;
    }

    @Override
    public void addBook(Book book) {
        bookRepository.setNewBook(book);
    }

}
