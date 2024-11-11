package controllers.admin;

import java.io.IOException;
import java.sql.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Author_22110311;
import service.AuthorService_22110311;
import serviceImpl.AuthorServiceImpl_22110311;

@WebServlet("/admin/update-author")
public class UpdateAuthorController_22110311 extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private AuthorService_22110311 authorService = new AuthorServiceImpl_22110311();
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Author_22110311 author = authorService.getAuthorById(id);
        request.setAttribute("author", author);
        request.getRequestDispatcher("author-form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Date dob = Date.valueOf(request.getParameter("dob"));

        Author_22110311 author = new Author_22110311(id, name, dob);
        authorService.updateAuthor(author);
        response.sendRedirect("list");
    }
}
