<%--
  Created by IntelliJ IDEA.
  User: 23624
  Date: 2021/4/29
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>login</title>
    <script type="text/javascript" src="jquery-3.5.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                //验证用户名
                let username = $("#01").val();
                let usernamepp = /^\w{5,12}$/;
                if (!usernamepp.test(username)) {
                    $("#spn").text("用户名不合法");
                    return false;
                }
                //验证密码
                let password = $("#02").val();
                if (!usernamepp.test(password)) {
                    $("#spn").text("密码不合法");
                    return false;
                }
                $("#spn").text("");
            })
        })
    </script>
    <title>Title</title>
</head>
<body>
<div>
    <span id="spn" style="color: red">
<%--        <%=request.getAttribute("message")==null?"请输入用户名和密码":request.getAttribute("message")%>--%>
        ${ empty requestScope.message ? "请输入用户名和密码" :requestScope.message }
    </span>
</div>
<form action="UserServlet" method="post">
    <input type="hidden" name="action" value="login">
    用户名：<input type="text" name="username" id="01"
               value="${requestScope.username}"><br>
    密码：<input type="password" name="password" id="02"><br>
    <button type="submit" id="btn">登录</button>
</form>
</body>
</html>
