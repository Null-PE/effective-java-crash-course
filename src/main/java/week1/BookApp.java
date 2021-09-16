package week1;

import java.util.Collections;
import java.util.List;

import week1.domain.repository.BookRepository;
import week1.domain.repository.MockBookRepository;
import week1.domain.value.Book;

public class BookApp {

	public static void main(String[] args) {

		BookRepository repository = new MockBookRepository();
		List<Book> books = repository.findAll();

		Collections.sort(books);
		for (Book book : books) {
			System.out.println(book);
		}

	}
}
