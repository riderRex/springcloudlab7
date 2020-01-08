<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/1/7
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring boot整合jsp页面</title>
</head>
<body>
    ${hello}
    <br/>
    Spring Cloud集成Web，访问jsp文件。
<br/>
<a href="http://localhost:8050/eurekaorder/order/2">访问SpringCloud微服务</a>
</body>
</html>
