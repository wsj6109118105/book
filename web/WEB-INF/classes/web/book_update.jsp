<%--
  Created by IntelliJ IDEA.
  User: 23624
  Date: 2021/5/4
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="../manager/BookServlet" method="post">
        <input type="hidden" name="action" value="update">
        <table border="3">
            <tr style="align-content: center">
                <td>书名</td>
                <td>价格</td>
                <td>作者</td>
                <td>销量</td>
                <td>库存</td>
                <td>操作</td>
            </tr>
            <tr>
                <td>
                    <input type="text" name="bookname" tabindex="1" value="${requestScope.book.bookname}">
                </td>
                <td>
                    <input type="text" name="price" tabindex="1" value="${requestScope.book.price}">
                </td>
                <td>
                    <input type="text" name="author" tabindex="1" value="${requestScope.book.author}">
                </td>
                <td>
                    <input type="text" name="sales" tabindex="1" value="${requestScope.book.sales}">
                </td>
                <td>
                    <input type="text" name="inventory" tabindex="1" value="${requestScope.book.inventory}">
                </td>
                <td colspan="2">
                    <button type="submit" id="btn">提交</button>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
