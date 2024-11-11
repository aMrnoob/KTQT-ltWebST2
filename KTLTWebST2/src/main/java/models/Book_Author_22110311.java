package models;

public class Book_Author_22110311 {
	
	private int bookId;
    private int authorId;
    
    public Book_Author_22110311() {
		// TODO Auto-generated constructor stub
	}
    
    public Book_Author_22110311(int bookId, int authorId) {
		// TODO Auto-generated constructor stub
    	this.bookId = bookId;
    	this.authorId = authorId;
	}
    
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
}
