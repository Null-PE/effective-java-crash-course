package week1.domain.repository;

import java.util.List;

import week1.domain.value.Book;

public interface BookRepository {

	public List<Book> findAll();

}
