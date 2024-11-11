package serviceImpl;

import java.util.List;

import dao.AuthorDAO_22110311;
import daoImpl.AuthorDAOImpl_22110311;
import models.Author_22110311;
import service.AuthorService_22110311;

public class AuthorServiceImpl_22110311 implements AuthorService_22110311{

	private AuthorDAO_22110311 authorDAO = new AuthorDAOImpl_22110311();
	
	@Override
	public void addAuthor(Author_22110311 author) {
		// TODO Auto-generated method stub
		authorDAO.addAuthor(author);
	}

	@Override
	public void updateAuthor(Author_22110311 author) {
		// TODO Auto-generated method stub
		authorDAO.updateAuthor(author);
	}

	@Override
	public void deleteAuthor(int authorId) {
		// TODO Auto-generated method stub
		authorDAO.deleteAuthor(authorId);
	}

	@Override
	public List<Author_22110311> getAuthors(int page, int pageSize) {
		// TODO Auto-generated method stub
		return authorDAO.getAuthors(page, pageSize);
	}

	@Override
	public int getAuthorCount() {
		// TODO Auto-generated method stub
		return authorDAO.getAuthorCount();
	}

	@Override
	public Author_22110311 getAuthorById(int authorId) {
		// TODO Auto-generated method stub
		return authorDAO.getAuthorById(authorId);
	}

}
