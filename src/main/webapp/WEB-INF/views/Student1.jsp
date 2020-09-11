<%--
  Created by IntelliJ IDEA.
  User: HPW
  Date: 2020-07-17
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="/addstudent" method="post">
    <table>
        <tr>
            <td>学生编号：</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>学生姓名：</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>学生邮箱：</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>学生年龄：</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>--%>

<%--<form action="/addstudent2" method="post">
    <table>
        <tr>
            <td>学生编号：</td>
            <td><input type="text" name="id" value="${id}"></td>
        </tr>
        <tr>
            <td>学生姓名：</td>
            <td><input type="text" name="name" value="${name}"></td>
        </tr>
        <tr>
            <td>学生邮箱：</td>
            <td><input type="text" name="email" value="${email}"></td>
        </tr>
        <tr>
            <td>学生年龄：</td>
            <td><input type="text" name="age" value="${age}"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>--%>

<%--<form action="/addstudent" method="post">
    <table>
        <tr>
            <td>学生编号：</td>
            <td><input type="text" name="id" value="${student1.id}"></td>
        </tr>
        <tr>
            <td>学生姓名：</td>
            <td><input type="text" name="name" value="${student1.name}"></td>
        </tr>
        <tr>
            <td>学生邮箱：</td>
            <td><input type="text" name="email" value="${student1.email}"></td>
        </tr>
        <tr>
            <td>学生年龄：</td>
            <td><input type="text" name="age" value="${student1.age}"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form>--%>

<form action="/addstudent" method="post">
    <table>
        <tr>
            <td>学生编号：</td>
            <td><input type="text" name="id" value="${s.id}"></td>
        </tr>
        <tr>
            <td>学生姓名：</td>
            <td><input type="text" name="name" value="${s.name}"></td>
        </tr>
        <tr>
            <td>学生邮箱：</td>
            <td><input type="text" name="email" value="${s.email}"></td>
        </tr>
        <tr>
            <td>学生年龄：</td>
            <td><input type="text" name="age" value="${s.age}"></td>
        </tr>
        <tr>
            <td>网址：</td>
            <td><input type="text" name="address" value="${info.address}"></td>
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
