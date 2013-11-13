package com.bharat.client;

public class shipped_books {

	Books book;
	public shipped_books(Books book)
	{
		this.book=book;
	}
	/**
	 * @return the book
	 */
	public Books getBook() {
		return book;
	}
	/**
	 * @param book the book to set
	 */
	public void setBook(Books book) {
		this.book = book;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "shipped_books [book=" + book + "]";
	}
	
}
