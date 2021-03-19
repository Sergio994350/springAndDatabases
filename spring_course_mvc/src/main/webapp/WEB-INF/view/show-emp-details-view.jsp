<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2> Dear Employee, you are Welcome! </h2>

<br>
<br>
<%--Your name: ${param.employeeName}--%>

Your name: ${employee.name}
<br>
your surname: ${employee.surname}
<br>
your salary: ${employee.salary}
<br>
your department: ${employee.department}
<br>
your car: ${employee.carBrand}
<br>
your language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>

</ul>
<br>
Phone number: ${employee.phoneNumber}
<br>
E-mail: ${employee.email}


</body>
</html>