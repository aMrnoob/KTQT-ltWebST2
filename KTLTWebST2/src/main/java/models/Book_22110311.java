package models;

import java.sql.Date;

public class Book_22110311 {
	
	private int bookId;
    private int isbn;
    private String title;
    private String publisher;
    private double price;
    private String description;
    private Date publishDate;
    private String coverImage;
    private int quantity;
    
    public Book_22110311() {
		// TODO Auto-generated constructor stub
	}
    
    public Book_22110311(int bookId, int isbn, String title, String publisher, double price,
    		String description, Date publishDate, String coverImage, int quantity) {
		// TODO Auto-generated constructor stub
    	this.bookId = bookId;
    	this.isbn = isbn;
    	this.title = title;
    	this.price = price;
    	this.description = description;
    	this.publishDate = publishDate;
    	this.coverImage = coverImage;
    	this.quantity = quantity;
	}
    
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getCoverImage() {
		return coverImage;
	}
	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
    
}
