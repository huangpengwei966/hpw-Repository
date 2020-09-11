<%--
  Created by IntelliJ IDEA.
  User: HPW
  Date: 2020-06-29
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addclass" method="post">
    <table>
        <tr>
            <td>班级编号：</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>班级名称：</td>
            <td><input type="text" name="info['name']"></td>
        </tr>
        <tr>
            <td>班级位置：</td>
            <td><input type="text" name="info['pos']"></td>
        </tr>
        <tr>
            <td>学生编号：</td>
            <td><input type="text" name="students[0].id"></td>
        </tr>
        <tr>
            <td>学生姓名：</td>
            <td><input type="text" name="students[0].name"></td>
        </tr>
        <tr>
            <td>学生编号：</td>
            <td><input type="text" name="students[1].id"></td>
        </tr>
        <tr>
            <td>学生姓名：</td>
            <td><input type="text" name="students[1].name"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
