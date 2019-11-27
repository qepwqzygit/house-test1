<%@ page contentType="text/html; utf-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>区域信息</h2>
<table border="2">
    <tr>
        <td>编号</td><td>区域名称</td>
    </tr>
    <c:forEach items="${list}" var="d">
        <tr>
            <td>${d.id}</td><td>${d.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
