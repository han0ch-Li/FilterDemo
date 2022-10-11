<%--
  Created by IntelliJ IDEA.
  User: 89217
  Date: 2022-10-09
  Time: 下午 5:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <h1>当前有<span style="color: brown"><%=this.getServletConfig().getServletContext().getAttribute("OnlineCount")%></span>人在线</h1>
  </body>
</html>
