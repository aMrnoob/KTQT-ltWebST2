package models;

public class Rating_22110311 {
	
	private int userId;
    private int bookId;
    private int rating;
    private String reviewText;
    
    public Rating_22110311() {
		// TODO Auto-generated constructor stub
	}
    
    public Rating_22110311(int userId, int bookId, int rating, String reviewText) {
		// TODO Auto-generated constructor stub
    	this.userId = userId;
    	this.bookId = bookId;
    	this.rating = rating;
    	this.reviewText = reviewText;
	}
    
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
}
