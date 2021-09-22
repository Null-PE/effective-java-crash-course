package week1.domain.value;

import java.time.LocalDate;
import java.util.Objects;

import com.google.common.base.MoreObjects;
import com.google.common.base.Strings;

public final class BookAnswer implements Comparable<BookAnswer> {

	private long id;
	private String title;
	private String author;
	private LocalDate releaseDate;

	private int hashCode; // 0 is default value

	/**
	 * Returns a Immutable Object for Book
	 * 
	 * @param id
	 * @param title
	 * @param author
	 * @param releaseDate
	 * @throws IllegalArgumentException if id is 0 or negative value
	 * @throws IllegalArgumentException if title is null or empty
	 * @throws IllegalArgumentException if author is null or empty
	 * @throws IllegalArgumentException if releaseDate is null
	 */
	public BookAnswer(long id, String title, String author, LocalDate releaseDate) {
		if (id < 1) {
			throw new IllegalArgumentException("id must be greater than 0");
		}

		if (Strings.isNullOrEmpty(title)) {
			throw new IllegalArgumentException("title must not be null and empty");
		}

		if (Strings.isNullOrEmpty(author)) {
			throw new IllegalArgumentException("author must not be null and empty ");
		}

		if (Objects.isNull(releaseDate)) {
			throw new IllegalArgumentException("releaseDate must not be null");
		}

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

	@Override
	public String toString() {
		MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(this);
		helper.add("id", id);
		helper.add("title", title);
		helper.add("author", author);
		helper.add("releaseDate", releaseDate);
		return helper.toString();
	}

	@Override
	public int hashCode() {
		if (hashCode == 0) {
			hashCode = Objects.hash(Long.valueOf(id), author, title, releaseDate);
		}
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		return equalTo((BookAnswer) obj);
	}

	private boolean equalTo(BookAnswer another) {
		return Objects.equals(Long.valueOf(id), Long.valueOf(another.getId()))
				&& Objects.equals(author, another.getAuthor()) && Objects.equals(title, another.getTitle())
				&& Objects.equals(releaseDate, another.releaseDate);
	}

	@Override
	public int compareTo(BookAnswer o) {
		int result = this.getAuthor().compareTo(o.getAuthor());
		if (result == 0) {
			return this.getTitle().compareTo(o.getTitle());
		}
		return result;
	}

}
