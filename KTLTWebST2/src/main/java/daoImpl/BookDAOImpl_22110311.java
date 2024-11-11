package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

import dao.BookDAO_22110311;
import models.Book_22110311;

public class BookDAOImpl_22110311 implements BookDAO_22110311{

	@Override
	public void addBook(Book_22110311 book) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO book (bookId, isbn, title, publisher, price, description, publishDate, coverImage, quantity) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        int bookId = getValidId() + 1;

        try (Connection connection = ConnectDB_22110311.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setInt(1, bookId);
            statement.setInt(2, book.getIsbn());
            statement.setString(3, book.getTitle());
            statement.setString(4, book.getPublisher());
            statement.setDouble(5, book.getPrice());
            statement.setString(6, book.getDescription());
            statement.setDate(7, new java.sql.Date(book.getPublishDate().getTime()));
            statement.setString(8, book.getCoverImage());
            statement.setInt(9, book.getQuantity());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void updateBook(Book_22110311 book) {
		// TODO Auto-generated method stub
		String sql = "UPDATE book SET isbn = ?, title = ?, publisher = ?, price = ?, description = ?, publishDate = ?, coverImage = ?, quantity = ? WHERE bookId = ?";
        
        try (Connection connection = ConnectDB_22110311.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setInt(1, book.getIsbn());
            statement.setString(2, book.getTitle());
            statement.setString(3, book.getPublisher());
            statement.setDouble(4, book.getPrice());
            statement.setString(5, book.getDescription());
            statement.setDate(6, new java.sql.Date(book.getPublishDate().getTime()));
            statement.setString(7, book.getCoverImage());
            statement.setInt(8, book.getQuantity());
            statement.setInt(9, book.getBookId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM book WHERE bookId = ?";
        
        try (Connection connection = ConnectDB_22110311.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setInt(1, bookId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	@Override
	public int getValidId() {
		// TODO Auto-generated method stub
		String sql = "SELECT MAX(bookId) FROM book";
	    int maxId = 0;

	    try (Connection connection = ConnectDB_22110311.getConnection();
	         PreparedStatement statement = connection.prepareStatement(sql);
	         ResultSet resultSet = statement.executeQuery()) {

	        if (resultSet.next()) {
	            maxId = resultSet.getInt(1);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return maxId;
	}

	@Override
	public DefaultTableModel getBook() {
		// TODO Auto-generated method stub
		String sql = """
		        SELECT b.*, r.userId, r.reviewText 
		        FROM book b 
		        LEFT JOIN review r ON b.bookId = r.bookId
		    """;

		    DefaultTableModel tableModel = new DefaultTableModel();

		    try (Connection connection = ConnectDB_22110311.getConnection();
		         PreparedStatement statement = connection.prepareStatement(sql);
		         ResultSet resultSet = statement.executeQuery()) {

		        tableModel.addColumn("Book ID");
		        tableModel.addColumn("ISBN");
		        tableModel.addColumn("Title");
		        tableModel.addColumn("Publisher");
		        tableModel.addColumn("Price");
		        tableModel.addColumn("Description");
		        tableModel.addColumn("Publish Date");
		        tableModel.addColumn("Cover Image");
		        tableModel.addColumn("Quantity");
		        tableModel.addColumn("User ID");
		        tableModel.addColumn("Review Text");

		        while (resultSet.next()) {
		            Object[] row = new Object[11];
		            row[0] = resultSet.getInt("bookId");
		            row[1] = resultSet.getInt("isbn");
		            row[2] = resultSet.getString("title");
		            row[3] = resultSet.getString("publisher");
		            row[4] = resultSet.getDouble("price");
		            row[5] = resultSet.getString("description");
		            row[6] = resultSet.getDate("publishDate");
		            row[7] = resultSet.getString("coverImage");
		            row[8] = resultSet.getInt("quantity");
		            row[9] = resultSet.getInt("userId");
		            row[10] = resultSet.getString("reviewText");

		            tableModel.addRow(row);
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return tableModel;
	}	
}
