package dao;

import javax.swing.table.DefaultTableModel;

import models.Book_22110311;

public interface BookDAO_22110311 {
	
	void addBook(Book_22110311 book);
	void updateBook(Book_22110311 book);
	void deleteBook(int bookId);
	int getValidId();
	DefaultTableModel getBook();
}
