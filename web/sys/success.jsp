<%@ page import="org.example.util.Constant" %><%--
  Created by IntelliJ IDEA.
  User: 89217
  Date: 2022-10-10
  Time: 上午 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    Object attribute = request.getSession().getAttribute(Constant.USER_SESSION);
//    if(attribute == null){
//        response.sendRedirect("/FilterDemo/login.jsp");
//    }
////    在前端页面判断是否存在session，不存在则无法进入用户主页，一般交给过滤器做
%>
  <h1>Welcome</h1>
    <p><a href="/FilterDemo/Servlet/logout">Logout</a></p>
</body>
</html>
