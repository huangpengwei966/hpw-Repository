<%--
  Created by IntelliJ IDEA.
  User: HPW
  Date: 2020-07-23
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addbook3" method="post">
    <table>
        <tr>
            <td>ID：</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>书名：</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>作者：</td>
            <td><input type="text" name="author"></td>
        </tr>
        <tr>
            <td>上架时间：</td>
            <td><input type="text" name="publish" value="2017-08-25"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="添加">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
