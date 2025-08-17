package com.cdac.acts.BooksLibrary.Book;

import java.time.LocalDate;
import java.util.Objects;

import com.cdac.acts.BooksLibrary.BookGenre;

public class Books {

	private Integer bookId;
	private String title;
	private String author;
	private BookGenre genre;
	private LocalDate pubyear;
	private Double price;
	
	public Books() {
		
	}

	public Books(Integer bookId, String title, String author, BookGenre genre, LocalDate pubyear, Double price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pubyear = pubyear;
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BookGenre getGenre() {
		return genre;
	}

	public void setGenre(BookGenre genre) {
		this.genre = genre;
	}

	public LocalDate getPubyear() {
		return pubyear;
	}

	public void setPubyear(LocalDate pubyear) {
		this.pubyear = pubyear;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookId, genre, price, pubyear, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(author, other.author) && bookId == other.bookId && genre == other.genre
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(pubyear, other.pubyear) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Books {"
				+ "\nbookId: " + bookId 
				+ "\ntitle: " + title
				+ "\nauthor: " + author
				+ "\ngenre: " + genre 
				+ "\npubyear: "+ pubyear 
				+ "\nprice:" + price + "\n}";
	}
	
	
}
