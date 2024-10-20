<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Management Application</title>
</head>
<body>
<h1>Search For Your Products!</h1>

    <form action="${pageContext.request.contextPath}/searchProduct" method="post">
        Search By Product ID: <input type="text" name="pid"><br>
        Search By Product Name: <input type="text" name="pname"><br>
        Search By Product Location <input type="text" name="location"><br>
        Search By Product Quantity <input type="text" name="quantity"><br>
        <input type="submit" value="Search Product">
    </form>

</body>
</html>