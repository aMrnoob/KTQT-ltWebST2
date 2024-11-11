package service;

import java.util.List;

import models.Author_22110311;

public interface AuthorService_22110311 {
	
	public void addAuthor(Author_22110311 author);
	public void updateAuthor(Author_22110311 author);
	public void deleteAuthor(int authorId);
	public List<Author_22110311> getAuthors(int page, int pageSize);
	public int getAuthorCount();
	public Author_22110311 getAuthorById(int authorId);
}
