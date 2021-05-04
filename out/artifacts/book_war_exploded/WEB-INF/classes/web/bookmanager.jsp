<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 23624
  Date: 2021/5/2
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台</title>
    <script type="text/javascript" src="../jquery-3.5.1.js"></script>
    <script type="text/javascript">
        $(function (){
            $("a.D").click(function (){
                return confirm("确定要删除"+$(this).parent().parent().find("td:first").text()+"吗？");
            });
        })
    </script>
</head>
<body>
    <div>
        <table border="1">
            <tr>
                <td width="300">书名</td>
                <td width="100">价格</td>
                <td width="100">作者</td>
                <td width="100">销量</td>
                <td width="100">库存</td>
                <td width="100">操作</td>
            </tr>
            <c:forEach items="${requestScope.books}" var="book">
                <tr>
                    <td>${book.bookname}</td>
                    <td>${book.price}</td>
                    <td>${book.author}</td>
                    <td>${book.sales}</td>
                    <td>${book.inventory}</td>
                    <td>
                        <a class="U" href="BookServlet?action=getbook&bookname=${book.bookname}">修改</a>
                        <a class="D" href="../manager/BookServlet?action=delete&bookname=${book.bookname}">删除</a>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td><a href="../book_edit.jsp">添加图书</a></td>
            </tr>
        </table>

    </div>
</body>
</html>
