package models;

import java.sql.Date;

public class Author_22110311 {
	
	private int authorId;
    private String authorName;
    private Date dateOfBirth;
    
    public Author_22110311() {
		// TODO Auto-generated constructor stub
	}
    
    public Author_22110311(int authorId, String authorName, Date dateOfBirth) {
		// TODO Auto-generated constructor stub
    	this.authorId = authorId;
    	this.authorName = authorName;
    	this.dateOfBirth = dateOfBirth;
	}
    
    
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
