package week1.domain.value;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Book implements Comparable<Book> {

	private long id;
	private String title;
	private String author;
	private LocalDate releaseDate;

	public Book(long id, String title, String author, LocalDate releaseDate) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.releaseDate = releaseDate;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	// TODO4 override toString and pass BookTest.testToString (ask help to
	// eclipse and refactor by using StringJoiner)
	// Item 12

	// TODO5 override equals and hashCode (ask help to eclipse)
	// Item 10 11

	// TODO6 implements Comparable and pass
	// BookTest.testCompareTo_sortedByAuthorAndTitle
	// Item 14
	@Override
	public int compareTo(Book o) {
		return 0;
	}
	// TOOD7 add validation logic to constructor and add javadoc
	// ITEM 49 , ITEM 74
	// throw illegalArgumentException
	// - if id is zero or negative value
	// - if title is null or empty
	// - if author is null or empty
	// - if releaseDate is null

}
