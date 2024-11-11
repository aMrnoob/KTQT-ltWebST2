package controllers.user;

import java.io.IOException;

import javax.swing.table.DefaultTableModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.BookService_22110311;
import serviceImpl.BookServiceImpl_22110311;

@WebServlet(urlPatterns = {"/user/detail-book"})
public class DetailBookController_22110311 extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private BookService_22110311 bookService = new BookServiceImpl_22110311();
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    
		DefaultTableModel booksTable = bookService.getBook();
		
		request.setAttribute("bookOfAuthor", booksTable);
		request.getRequestDispatcher("/views/user/detailBook.jsp").forward(request, response);	 
	}
}
