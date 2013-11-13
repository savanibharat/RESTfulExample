package com.bharat.client;

import java.util.ArrayList;
import java.util.List;


public class Books {
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", title=" + title + ", category="
				+ category + ", coverimage=" + coverimage + ", shipped_books="
				+ shipped_books + "]";
	}

	private long isbn;
    private String title;
    private String category;
    private String coverimage;
    private List<shipped_books> shipped_books=new ArrayList<shipped_books>();
    // add more fields here

    /**
     * @return the isbn
     */
    public long getIsbn() {
	return isbn;
    }

    /**
	 * @return the shipped_books
	 */
	public List<shipped_books> getShipped_books() {
		return shipped_books;
	}

	/**
	 * @param shipped_books the shipped_books to set
	 */
	public void setShipped_books(List<shipped_books> shipped_books) {
		this.shipped_books = shipped_books;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the coverimage
	 */
	public String getCoverimage() {
		return coverimage;
	}

	/**
	 * @param coverimage the coverimage to set
	 */
	public void setCoverimage(String coverimage) {
		this.coverimage = coverimage;
	}

	/**
     * @param isbn
     *            the isbn to set
     */
    public void setIsbn(long isbn) {
	this.isbn = isbn;
    }

    /**
     * @return the title
     */
    public String getTitle() {
	return title;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle(String title) {
	this.title = title;
    }
}
