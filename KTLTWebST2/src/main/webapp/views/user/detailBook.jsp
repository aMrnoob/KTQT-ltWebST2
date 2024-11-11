<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.swing.table.DefaultTableModel" %>
<%@ page import="java.util.Vector" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh sách sách</title>
</head>
<body>
    <%
        DefaultTableModel booksTable = (DefaultTableModel) request.getAttribute("detailBook");
        DefaultTableModel authorsTable = (DefaultTableModel) request.getAttribute("authors");
        DefaultTableModel ratingsTable = (DefaultTableModel) request.getAttribute("ratings");
    %>
    
    <% if (booksTable == null || booksTable.getRowCount() == 0) { %>
        <p>Không có sách nào được hiển thị cho tác giả này.</p>
    <% } else { %>
        <table style="width: 100%; border-collapse: collapse; border: 2px solid black;">
            <tr>
                <td colspan="2" style="border: 1px solid black; padding: 8px;">
                    <strong>Danh sách Sách</strong>
                </td>
            </tr>
            <% 
                for (int i = 0; i < booksTable.getRowCount(); i++) {
                    String coverImage = booksTable.getValueAt(i, booksTable.findColumn("cover_image")).toString(); 
                    String title = booksTable.getValueAt(i, booksTable.findColumn("title")).toString();
                    String isbn = booksTable.getValueAt(i, booksTable.findColumn("isbn")).toString();
                    String publisher = booksTable.getValueAt(i, booksTable.findColumn("publisher")).toString();
                    String publishDate = booksTable.getValueAt(i, booksTable.findColumn("publish_date")).toString();
                    String quantity = booksTable.getValueAt(i, booksTable.findColumn("quantity")).toString();
            %>
            
            <tr>
                <td style="border: 1px solid black; padding: 8px; width: 20%; text-align: center;">
                    <%= coverImage %>
                </td>
                <td style="border: 1px solid black; padding: 8px;">
                    <p>Tiêu đề: <span><%= title %></span></p>
                    <p>Mã ISBN: <span><%= isbn %></span></p>
                    <p>Nhà xuất bản: <span><%= publisher %></span></p>
                    <p>Ngày xuất bản: <span><%= publishDate %></span></p>
                    <p>Số lượng: <span><%= quantity %></span></p>
                    
                    <p><strong>Tác giả:</strong></p>
                    <ul>
                        <% 
                            for (int j = 0; j < authorsTable.getRowCount(); j++) {
                                String bookId = booksTable.getValueAt(i, booksTable.findColumn("bookid")).toString();
                                String authorBookId = authorsTable.getValueAt(j, authorsTable.findColumn("bookid")).toString();
                                if (bookId.equals(authorBookId)) {
                                    String authorName = authorsTable.getValueAt(j, authorsTable.findColumn("author_name")).toString();
                        %>
                                    <li><%= authorName %></li>
                        <% 
                                }
                            }
                        %>
                    </ul>
                    
                    <p><strong>Đánh giá:</strong></p>
                    <ul>
                        <% 
                            for (int k = 0; k < ratingsTable.getRowCount(); k++) {
                                String bookId = booksTable.getValueAt(i, booksTable.findColumn("bookid")).toString();
                                String ratingBookId = ratingsTable.getValueAt(k, ratingsTable.findColumn("bookid")).toString();
                                if (bookId.equals(ratingBookId)) {
                                    String rating = ratingsTable.getValueAt(k, ratingsTable.findColumn("rating")).toString();
                                    String reviewText = ratingsTable.getValueAt(k, ratingsTable.findColumn("review_text")).toString();
                        %>
                                    <li>Rating: <%= rating %> - <%= reviewText %></li>
                        <% 
                                }
                            }
                        %>
                    </ul>
                </td>
            </tr>
            <% } %>
        </table>
    <% } %>
</body>
</html>
