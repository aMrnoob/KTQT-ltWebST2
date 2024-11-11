package controllers.admin;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Author_22110311;
import service.AuthorService_22110311;
import serviceImpl.AuthorServiceImpl_22110311;

@WebServlet("/admin/view-authors")
public class ViewAuthorController_22110311 extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private AuthorService_22110311 authorService = new AuthorServiceImpl_22110311();
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int page = 1;
        int pageSize = 10;
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(request.getParameter("page"));
        }

        List<Author_22110311> authors = authorService.getAuthors(page, pageSize);
        int totalAuthors = authorService.getAuthorCount();
        int totalPages = (int) Math.ceil((double) totalAuthors / pageSize);

        request.setAttribute("authors", authors);
        request.setAttribute("currentPage", page);
        request.setAttribute("totalPages", totalPages);
        request.getRequestDispatcher("author-list.jsp").forward(request, response);
    }
}
