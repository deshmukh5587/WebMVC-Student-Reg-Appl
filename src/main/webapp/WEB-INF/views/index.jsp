<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>

<h3>Student Registration Form</h3>

<front color='green'>${msg}</front>

<form:form action="save" modelAttribute="student" method="POST">

    <table>

        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>

        <tr>
            <td>Email:</td>
            <td><form:input path="email"/></td>
        </tr>

        <tr>
            <td>Gender:</td>
            <td>
                <form:radiobutton path="gender" value="Male"/> Male
                <form:radiobutton path="gender" value="Female"/> Female
            </td>
        </tr>

        <tr>
            <td>Course:</td>
            <td>
                <form:select path="course">
                    <form:option value="">-- Select --</form:option>
                    <form:options items="${courses}" />
                </form:select>
            </td>
        </tr>

        <tr>
            <td>Timing:</td>
            <td>
                <form:checkboxes path="timing" items="${timings}"/>
            </td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Save"/></td>
        </tr>

    </table>

</form:form>

</body>
</html>
