<%--
  Created by IntelliJ IDEA.
  User: 23624
  Date: 2021/5/3
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加图书</title>
    <script type="text/javascript" src="jquery-3.5.1.js"></script>
</head>
<body>
    <div>
        <form action="manager/BookServlet" method="post">
            <input type="hidden" name="action" value="add">
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
                        <input type="text" name="bookname" tabindex="1">
                    </td>
                    <td>
                        <input type="text" name="price" tabindex="1">
                    </td>
                    <td>
                        <input type="text" name="author" tabindex="1">
                    </td>
                    <td>
                        <input type="text" name="sales" tabindex="1">
                    </td>
                    <td>
                        <input type="text" name="inventory" tabindex="1">
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
