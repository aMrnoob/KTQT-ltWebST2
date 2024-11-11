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
        // Lấy đối tượng table từ request
        DefaultTableModel booksTable = (DefaultTableModel) request.getAttribute("bookOfAuthor");
    %>
    
    <!-- Kiểm tra nếu table null thì hiển thị thông báo -->
    <% if (booksTable == null || booksTable.getRowCount() == 0) { %>
        <p>Không có sách nào được hiển thị cho tác giả này.</p>
    <% } else { %>
        <table style="width: 100%; border-collapse: collapse; border: 2px solid black;">
            <tr>
                <td colspan="2" style="border: 1px solid black; padding: 8px;">
                    <strong>Tác giả: Nguyễn Văn A</strong>
                </td>
            </tr>
            <% 
                // Duyệt qua các dòng của bảng nếu không phải null
                for (int i = 0; i < booksTable.getRowCount(); i++) {
                    String coverImage = "[cover_image]"; // Giả định đây là hình ảnh mẫu
                    String title = booksTable.getValueAt(i, booksTable.findColumn("title")).toString();
                    String isbn = booksTable.getValueAt(i, booksTable.findColumn("isbn")).toString();
                    String publisher = booksTable.getValueAt(i, booksTable.findColumn("publisher")).toString();
                    String publishDate = booksTable.getValueAt(i, booksTable.findColumn("publishDate")).toString();
                    String quantity = booksTable.getValueAt(i, booksTable.findColumn("quantity")).toString();
                    String reviewCount = booksTable.getValueAt(i, booksTable.findColumn("reviewText")).toString();
            %>
            
            <tr>
                <td style="border: 1px solid black; padding: 8px; width: 20%; text-align: center;">
                    <%= coverImage %>
                </td>
                <td style="border: 1px solid black; padding: 8px;">
                    <p>Tiêu đề: <span><%= title %></span></p>
                    <p>Mã ISBN: <span><%= isbn %></span></p>
                    <p>Publisher: <span><%= publisher %></span></p>
                    <p>Publish Date: <span><%= publishDate %></span></p>
                    <p>Quantity: <span><%= quantity %></span></p>
                    <p>Review: <a href="#">(<%= reviewCount %>)</a></p>
                </td>
            </tr>
            <% } %>
        </table>
    <% } %>
</body>
</html>
