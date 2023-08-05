<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
    <title>Input</title>
</head>

<body>
<h2>Dear Employee, Please enter your details</h2>
<br>
<br>

<%--<form:form action="showDetails" modelAttribute="employee">--%>
<%--<form:form action="showDetails" modelAttribute="employee" method="get">--%>
<form:form action="showDetails" modelAttribute="employee" method="post">
    Name
    <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>

    Surname
    <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>

    Salary
    <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>

    <%-- 1.1 - select items: hard coded --%>
<%--    Department--%>
<%--    <form:select path="department">--%>
<%--        <form:option value="Information Technology" label="IT"/>--%>
<%--        <form:option value="Human Resources" label="HR"/>--%>
<%--        <form:option value="Sales" label="Sales"/>--%>
<%--    </form:select>--%>
<%--    <br><br>--%>
    <%-- 1.2 - select items: Map<String, String> departments --%>
    Department
    <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>

    <%-- 2.1 - radiobutton items: hard coded --%>
<%--    Which car do you want?--%>
<%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
<%--    MB <form:radiobutton path="carBrand" value="Mersedes-Benz"/>--%>
<%--    <br><br>--%>
    <%-- 2.2 - radiobutton items: Map<String, String> carBrands --%>
    Which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>

    <%-- 3.1 - checkbox items: hard coded --%>
<%--    Foreign language(s)--%>
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Deutsche"/>--%>
<%--    FR <form:checkbox path="languages" value="French"/>--%>
<%--    <br><br>--%>
    <%-- 3.2 - checkbox items: Map<String, String> languageList --%>
    Foreign language(s)
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br><br>

    Phone number
    <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>

    Email
    <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>

    <input type="submit" value="OK">
</form:form>
</body>

</html>