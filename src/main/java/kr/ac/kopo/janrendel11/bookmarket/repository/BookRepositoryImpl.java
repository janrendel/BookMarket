package kr.ac.kopo.janrendel11.bookmarket.repository;

import kr.ac.kopo.janrendel11.bookmarket.domain.Book;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private List<Book> listOfBooks = new ArrayList<Book>();

    public BookRepositoryImpl() {
        Book book1 = new Book();
        book1.setBookId("isbn0001");
        book1.setName("스프링부트완전정복");
        book1.setUnitPrice(BigDecimal.valueOf(35000));
        book1.setAuthor("송미영");
        book1.setDescription("스프링 부트는 스프링을 기반으로 쉽고 빠르게 웹 애플리케이션을 개발할 수 있는 도구이다. \n" +
                             "이 책에서는 스프링 부트의 기본 개념을 쉽게 이해하고 다양한 실습 예제로 빠르게 익힐 수 있다.\n" +
                             "그리고 단계별 실습을 따라 하다 보면 도서 쇼핑몰 구축 프로젝트를 완성할 수 있다. \n" +
                             "개념-실습-프로젝트의 3단계 학습으로 스프링 부트를 제대로 익힌다면 개발 시간을 단축하고 생산성을 높일 수 있는 개발자로 성장할 수 있다.\n"
                );
        book1.setPublisher("길벗캠퍼스");
        book1.setCategory("IT교재");
        book1.setUnitsInStock(1000);
        book1.setReleaseDate("2024-12-31");
        book1.setCondition("신규도서");

        Book book2 = new Book();
        book2.setBookId("isbn0002");
        book2.setName("제목");
        book2.setUnitPrice(BigDecimal.valueOf(99999));
        book2.setAuthor("ㅇㅇㅇ");
        book2.setDescription("''''''''''''''''''''''''''''''''''''''''''''''''''''''\n " +
                             "''''''''''''''''''''''''''''''''''''''''''''''''''''''\n" +
                             "''''''''''''''''''''''''''''''''''''''''''''''''''''''\n" +
                             "''''''''''''''''''''''''''''''''''''''''''''''''''''''\n " +
                             "''''''''''''''''''''''''''''''''''''''''''''''''''''''\n" +
                             "''''''''''''''''''''''''''''''''''''''''''''''''''''''" );
        book2.setPublisher("ㅇㅇㅇ");
        book2.setCategory("소설");
        book2.setUnitsInStock(1000);
        book2.setReleaseDate("2000-06-08");
        book2.setCondition("도서");

        Book book3 = new Book();
        book3.setBookId("isbn0003");
        book3.setName("Android Studio를 활용한 안드로이드");
        book3.setUnitPrice(BigDecimal.valueOf(34000));
        book3.setAuthor("우재남, 박길식");
        book3.setDescription("대학이나 IT 전문 학원의 안드로이드 프로그래밍 과목 수강생을 대상으로 한다. \n" +
                             "기본적인 프로그래밍을 접해본 독자라면 안드로이드에 꼭 필요한 Java 기초부터 안드로이드 앱 개발까지 학습 가능하도록 구성되어 있다. \n" +
                             "안드로이드 프로그래밍을 하면서 부딪힐 수 있는 다양한 오류나 실수까지 친절하게 안내하여 시행착오 없이 안드로이드를 빠르게 정복할 수 있다.");
        book3.setPublisher("한빛아카데미");
        book3.setCategory("IT전문서");
        book3.setUnitsInStock(700);
        book3.setReleaseDate("2020-12-21");
        book3.setCondition("신규도서");

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
    }

    @Override
    public List<Book> getAllBookList() {
        return listOfBooks;
    }

    @Override
    public Book getBookById(String bookId)  {
        Book bookInfo = null;
        for (Book book : listOfBooks) {
            if (book != null && book.getBookId() != null && book.getBookId().equals(bookId)) {
                bookInfo = book;
                break;
            }
}
            if (bookInfo == null) {
                throw new IllegalArgumentException("도서번호가 " + bookId + "인 해당 도서를 찾을 수 없습니다.");
            }

            return bookInfo;
        }
    }
