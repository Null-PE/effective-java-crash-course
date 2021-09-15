package week1.domain.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import week1.domain.value.Book;

public class MockBookRepository implements BookRepository {

	@Override
	public List<Book> findAll() {

		List<Book> books = new ArrayList<Book>();

		Book book1 = new Book(1, "Book1", "Abe Taro", LocalDate.of(2000, 4, 1));
		Book book2 = new Book(2, "Book2", "Abe Taro", LocalDate.of(2000, 4, 2));
		Book book3 = new Book(3, "Book1", "Kobayashi Taro", LocalDate.of(2000, 4, 3));
		Book book4 = new Book(4, "Book2", "Kobayashi Taro", LocalDate.of(2000, 4, 3));

		books.add(book3);
		books.add(book1);
		books.add(book2);
		books.add(book4);
		
		return books;
	}

}
