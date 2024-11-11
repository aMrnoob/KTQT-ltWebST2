package serviceImpl;

import javax.swing.table.DefaultTableModel;

import dao.BookDAO_22110311;
import daoImpl.BookDAOImpl_22110311;
import models.Book_22110311;
import service.BookService_22110311;

public class BookServiceImpl_22110311 implements BookService_22110311{

	private BookDAO_22110311 bookDAO = new BookDAOImpl_22110311();
	
	@Override
	public void addBook(Book_22110311 book) {
		// TODO Auto-generated method stub
		bookDAO.addBook(book);
	}

	@Override
	public void updateBook(Book_22110311 book) {
		// TODO Auto-generated method stub
		bookDAO.updateBook(book);
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		bookDAO.deleteBook(bookId);
	}

	@Override
	public int getValidId() {
		// TODO Auto-generated method stub
		return bookDAO.getValidId();
	}

	@Override
	public DefaultTableModel getBook() {
		// TODO Auto-generated method stub
		return bookDAO.getBook();
	}

}
