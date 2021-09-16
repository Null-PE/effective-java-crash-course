package week1.domain.value;

import java.time.LocalDate;

public class Track {

	private long id;
	private String title;
	private String author;
	private LocalDate releaseDate;

	public Track(long id, String title, String author, LocalDate releaseDate) {
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

}
