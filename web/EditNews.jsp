<%--
  Created by IntelliJ IDEA.
  User: 冯鹏
  Date: 2020/6/9
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="SaveNewsServlet"  method="post">
    新闻ID<input type="text" name="newid" value="${news.newID}"/>
    新闻标题<input type="text" name="title" value="${news.title}"/>
    新闻内容<input type="text" name="newcontent" value="${news.newsContent}"/>
    作者<input type="text" name="author" value="${news.author}"/>
    时间<input type="text" name="writedate" value="${news.newsDate}"/>
    <input type="submit" value="更新"/>
</form>
</body>
</html>
