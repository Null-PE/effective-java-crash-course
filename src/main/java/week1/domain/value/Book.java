package week1.domain.value;

import java.time.LocalDate;

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

	
	@Override 
	public String toString() {
		// TODO6 use MoreObjects.ToStringHelper to refactor the code
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", releaseDate=" + releaseDate + "]";
	}

	// TODO7 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		
		// TODO7
		// use Objects.equals to refactor the code
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (id != other.id)
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	// TODO8:
	// level1: use Objects.hash to refactor it.
	// level2: improve the performance(hint:this class is immutable)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	// TODO9: author > title
	@Override
	public int compareTo(Book o) {
		return 0;
	}

}
