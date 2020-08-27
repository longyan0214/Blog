<%--
  Created by IntelliJ IDEA.
  User: Long'Yan
  Date: 2020/8/27
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    用户信息
    <br>
    <c:forEach items="${userList }" var="user">
        ${user.uid }&nbsp;&nbsp;&nbsp;&nbsp;
        ${user.uname }&nbsp;&nbsp;&nbsp;&nbsp;
        ${user.usex }<br>
    </c:forEach>
</body>
</html>
