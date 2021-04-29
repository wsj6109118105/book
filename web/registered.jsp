<%--
  Created by IntelliJ IDEA.
  User: 23624
  Date: 2021/4/29
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <title>注册</title>
    <script type="text/javascript" src="jquery-3.5.1.js"></script>
    <script type="text/javascript">
        $(function () {
            //注册绑定单击事件
            $("#05").click(function () {
                //    1，验证用户名：字母，数字，下划线，5-12
                let username = $("#01").val();
                let usernamepp = /^\w{5,12}$/;
                if (!usernamepp.test(username)) {
                    $("#spn").text("用户名输入不合法");
                    return false;
                }
                //    2，验证密码：字母，数字，下划线，5-12
                let password = $("#02").val();
                if (!usernamepp.test(password)) {
                    $("#spn").text("密码不合法");
                    return false;
                }
                //    3，确认密码：
                let repas = $("#03").val();
                if (password != repas) {
                    $("#spn").text("密码不一致");
                    return false;
                }
                //    4邮箱验证：xxxxx@xxx.com
                let email = $("#04").val();
                let emailText = /\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/;
                if (!emailText.test(email)) {
                    $("#spn").text("邮箱不正确");
                    return false;
                }
                //

                $("#spn").text("");
            });

        })
    </script>
</head>
<body>
<div>
    <span id="spn" style="color: red"></span>
</div>
<div>
    <form action="RegisteredServlet" method="post">
        <label>用户名称：</label>
        <input type="text" name="username" id="01"
               placeholder="请输入用户名" tabindex="1"><br>
        <label>密码：</label>
        <input type="password" name="password" id="02"
               placeholder="请输入密码" tabindex="1"><br>
        <label>确认密码：</label>
        <input type="password" name="repas" id="03"
               placeholder="再次输入密码" tabindex="1"><br>
        <label>电子邮箱：</label>
        <input type="text" name="email" id="04"
               placeholder="请输入邮箱" tabindex="1"><br>
        <input type="submit" name="btn" id="05" value="注册">
    </form>
</div>
</body>
</html>
