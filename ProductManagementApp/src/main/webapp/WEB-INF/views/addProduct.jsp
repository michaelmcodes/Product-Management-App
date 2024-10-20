<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Management Application</title>
</head>
<body>
<h1>Add Your Products!</h1>

    <form action="${pageContext.request.contextPath}/addProduct" method="post">
        Enter Product ID: <input type="text" name="pid"><br>
        Enter Product Name: <input type="text" name="pname"><br>
        Enter Product Location <input type="text" name="location"><br>
        Enter Product Quantity <input type="text" name="quantity"><br>
        <input type="submit" value="Add Product">
    </form>
</body>
</html>