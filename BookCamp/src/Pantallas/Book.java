package Pantallas;

import java.io.Serializable;

public class Book implements Serializable {
	int book_id;
	String title;
	int fk_author;
	int year;
	int fk_publisher;
	int stock;
	public final static int SIZE = Integer.SIZE * 5 + Character.SIZE * 50;

	//id;titulo;FK_AUTOR;FK_EDITORIAL;año;stock
	public Book(int book_id, String title, int fk_author, int fk_publisher,int year,
			 int stock) {
		super();
		this.book_id = book_id;
		this.setTitle(title);
		this.fk_author = fk_author;
		this.year = year;
		this.fk_publisher = fk_publisher;
		this.stock = stock;
	}

	public Book() {
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", title=" + title + ", fk_author="
				+ fk_author + ", year=" + year + ", fk_publisher="
				+ fk_publisher + ", stock=" + stock + "]";
	}

	public void setTitle(String title) {
		StringBuffer buf = new StringBuffer(title);
		buf.setLength(50);
		this.title = buf.toString();

	}

	public int getFk_author() {
		return fk_author;
	}

	public void setFk_author(int fk_author) {
		this.fk_author = fk_author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getFk_publisher() {
		return fk_publisher;
	}

	public void setFk_publisher(int fk_publisher) {
		this.fk_publisher = fk_publisher;
	}

	public int getStock() {
		return stock;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (book_id != other.book_id)
			return false;
		if (fk_author != other.fk_author)
			return false;
		if (fk_publisher != other.fk_publisher)
			return false;
		if (stock != other.stock)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
