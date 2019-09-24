<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/24 0024
  Time: 上午 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
    <title>注册界面</title>
    <link rel="stylesheet" href="static/css/bootstrap.css">
    <link rel="stylesheet" href="static/css/bootstrap-theme.css">
    <script src="static/js/bootstrap.js"></script>
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="input-group">
    <form action="register">
        <input type="text" class="form-control" placeholder="真实姓名" aria-describedby="basic-addon1" name="user_name">
        <input type="text" class="form-control" placeholder="手机号" aria-describedby="basic-addon1" name="phone">
        <input type="text" class="form-control" placeholder="邮箱" aria-describedby="basic-addon1" name="email">
        <button type="submit" class="btn">注册</button>
    </form>
</div>
</body>
</html>
