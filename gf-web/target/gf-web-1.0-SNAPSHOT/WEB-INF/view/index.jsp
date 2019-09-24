<%--
  Created by IntelliJ IDEA.
  User: Beaulo
  Date: 2019/9/18
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
    <title>登录界面</title>
    <link rel="stylesheet" href="static/css/bootstrap.css">
    <link rel="stylesheet" href="static/css/bootstrap-theme.css">
    <script src="static/js/bootstrap.js"></script>
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="input-group">
    <form action="login">
        <input type="text" class="form-control" placeholder="账号名" aria-describedby="basic-addon1" name="userid">
        <input type="password" class="form-control" placeholder="密码" aria-describedby="basic-addon1" name="password">
        <div class="checkbox">
            <label class="radio-inline">
                <input type="radio" name="role" id="optionsRadios1" value="0" checked> 管理员
            </label>
            <label class="radio-inline">
                <input type="radio" name="role" id="optionsRadios2"  value="1"> 买家
            </label>
            <label class="radio-inline">
                <input type="radio" name="role" id="optionsRadios3"  value="2"> 卖家
            </label>
        </div>
        <input type="submit" class="btn" value="登录">
    </form>
    <form action="register_1">
        <input type="submit" class="btn" value="注册">
    </form>
</div>
</body>
</html>

