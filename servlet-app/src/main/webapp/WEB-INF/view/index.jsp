<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <title>Home</title>
</head>
<body>
<form:form modelAttribute="author"  method="post">
    <form:label path="firstname">
        First name
    </form:label>
    <form:input path="firstname" />
    </p>
    <form:label path="lastname">
        Last name
    </form:label>
    <form:input path="lastname" />
    </p>
    <form:label path="email">
        Email
    </form:label>
    <form:input path="email" />
    <button type="submit">Save</button>
</form:form>
</body>
</html>
