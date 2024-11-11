package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.AuthorDAO_22110311;
import models.Author_22110311;

public class AuthorDAOImpl_22110311 implements AuthorDAO_22110311{

	@Override
	public void addAuthor(Author_22110311 author) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO author (author_id, author_name, date_of_birth) VALUES (?, ?, ?)";

        int authorId = getValidId() + 1; // Assuming you have a method to get a new ID

        try (Connection connection = ConnectDB_22110311.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, authorId);
            statement.setString(2, author.getAuthorName());
            statement.setDate(3, new java.sql.Date(author.getDateOfBirth().getTime()));

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void updateAuthor(Author_22110311 author) {
		// TODO Auto-generated method stub
		String sql = "UPDATE author SET author_name = ?, date_of_birth = ? WHERE author_id = ?";

        try (Connection connection = ConnectDB_22110311.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, author.getAuthorName());
            statement.setDate(2, new java.sql.Date(author.getDateOfBirth().getTime()));
            statement.setInt(3, author.getAuthorId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void deleteAuthor(int authorId) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM author WHERE author_id = ?";

        try (Connection connection = ConnectDB_22110311.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, authorId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public List<Author_22110311> getAuthors(int page, int pageSize) {
		// TODO Auto-generated method stub
		List<Author_22110311> authors = new ArrayList<>();
        String sql = "SELECT * FROM author LIMIT ? OFFSET ?";
        int offset = (page - 1) * pageSize;

        try (Connection connection = ConnectDB_22110311.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, pageSize);
            statement.setInt(2, offset);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Author_22110311 author = new Author_22110311();
                author.setAuthorId(rs.getInt("author_id"));
                author.setAuthorName(rs.getString("author_name"));
                author.setDateOfBirth(rs.getDate("date_of_birth"));
                authors.add(author);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authors;
	}

	@Override
	public int getAuthorCount() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM author";
        int count = 0;

        try (Connection connection = ConnectDB_22110311.getConnection();
             Statement statement = connection.createStatement()) {

            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
	}
	
	@Override
	public Author_22110311 getAuthorById(int authorId) {
	    String sql = "SELECT * FROM author WHERE author_id = ?";
	    Author_22110311 author = null;

	    try (Connection connection = ConnectDB_22110311.getConnection();
	         PreparedStatement statement = connection.prepareStatement(sql)) {

	        statement.setInt(1, authorId);
	        ResultSet rs = statement.executeQuery();

	        if (rs.next()) {
	            author = new Author_22110311();
	            author.setAuthorId(rs.getInt("author_id"));
	            author.setAuthorName(rs.getString("author_name"));
	            author.setDateOfBirth(rs.getDate("date_of_birth"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return author;
	}

	
	private int getValidId() {
        String sql = "SELECT MAX(author_id) FROM author";
        int maxId = 0;

        try (Connection connection = ConnectDB_22110311.getConnection();
             Statement statement = connection.createStatement()) {

            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                maxId = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maxId;
    }

}
