<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: xhyan
  Date: 14-5-4
  Time: 下午5:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
	<h1>添加用户</h1>
    <form action="/user" method="post">
        用户名：
        <input type="text" name="username"/>
        </br>
        密  码：
        <input type="password" name="password"/>
        </br>
        邮  箱：
        <input type="email" name="mail"/>
        </br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>