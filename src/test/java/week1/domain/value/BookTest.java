package week1.domain.value;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BookTest {

	@Test
	void testToString() {

		Book book =  new Book(1, "SLAM DUNK 1", "Takehiko Inoue", LocalDate.of(1991, 2, 8));
		assertThat(book.toString(), is("Book [id=1, title=SLAM DUNK 1, author=Takehiko Inoue, releaseDate=1991-02-08]"));

	}

	@Test
	void testEquals_AllFiledsAreSame() {

		Book book1 = new Book(1, "SLAM DUNK 1", "Takehiko Inoue", LocalDate.of(1991, 2, 8));
		Book book2 = new Book(1, "SLAM DUNK 1", "Takehiko Inoue", LocalDate.of(1991, 2, 8));

		assertTrue(book1.equals(book2));

	}

	@ParameterizedTest
	@CsvSource({ "2,SLAM DUNK 1,Takehiko Inoue,1991-02-08", "1,SLAM DUNK 2,Takehiko Inoue,1991-02-08",
			"1,SLAM DUNK 1,Takehiro Inoue,1991-02-08", "1,SLAM DUNK 1,Takehiko Inoue,1991-02-09" })
	void testEquals_OneOfTheFiledIsNotSame(long bookId, String bookNo, String bookNm, LocalDate entryDate) {

		Book book1 = new Book(bookId, bookNo, bookNm, entryDate);
		Book book2 = new Book(1, "SLAM DUNK 1", "Takehiko Inoue", LocalDate.of(1991, 2, 8));

		assertFalse(book1.equals(book2));

	}

	@Test
	void testHashCode_AllFiledsAreSame() {
		Map<Book, Long> map = new HashMap<Book, Long>();
		Book book1 = new Book(1, "SLAM DUNK 1", "Takehiko Inoue", LocalDate.of(1991, 2, 8));
		Book book2 = new Book(1, "SLAM DUNK 1", "Takehiko Inoue", LocalDate.of(1991, 2, 8));
		map.put(book1, Long.valueOf(1));
		assertThat(map.get(book2), is(Long.valueOf(1)));

	}

	@ParameterizedTest
	@CsvSource({ "2,SLAM DUNK 1,Takehiko Inoue,1991-02-08", "1,SLAM DUNK 2,Takehiko Inoue,1991-02-08",
			"1,SLAM DUNK 1,Takehiro Inoue,1991-02-08", "1,SLAM DUNK 1,Takehiko Inoue,1991-02-09" })
	void testHashCode_OneOfTheFiledIsNotSame(long bookId, String bookNo, String bookNm, LocalDate entryDate) {
		Map<Book, Long> map = new HashMap<Book, Long>();

		Book book1 = new Book(bookId, bookNo, bookNm, entryDate);
		Book book2 = new Book(1, "SLAM DUNK 1", "Takehiko Inoue", LocalDate.of(1991, 2, 8));

		map.put(book1, Long.valueOf(1));
		assertThat(map.get(book2), nullValue());

	}

	@Test
	void testCompareTo_sortedByAuthorAndTitle() {
		// * Note remove the comment out for line:Collections.sort(bookloyees);

		List<Book> books = new ArrayList<Book>();

		Book book1 = new Book(1, "SLAM DUNK 1", "Takehiko Inoue", LocalDate.of(1991, 2, 8));
		Book book2 = new Book(2, "SLAM DUNK 2", "Takehiko Inoue", LocalDate.of(1991, 6, 10));
		Book book3 = new Book(3, "DRAGON BALL 1", "Akira Toriyama", LocalDate.of(1985, 9, 10));
		Book book4 = new Book(4, "DRAGON BALL 2", "Akira Toriyama", LocalDate.of(1986, 1, 10));

		books.add(book4);
		books.add(book2);
		books.add(book1);
		books.add(book3);

		Collections.sort(books);
		assertThat(books, IsIterableContainingInOrder.contains(book3, book4, book1, book2));

	}

}
