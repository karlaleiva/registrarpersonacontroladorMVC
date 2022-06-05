<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach var="listaTotal" items="${session.persona}">
</c:forEach><%-- 
    Document   : mostrartodo
    Created on : 06-02-2022, 03:33:11 PM
    Author     : MINEDUCYT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Todos los registros</h1>
        <c:forEach var="listaTotal" items="${session.persona}">
            dui:${listaTotal.dui}<br>
            apellido:${listaTotal.apellido}<br>
            nombres:&{listaTotal.nombre}<br>
            <br>
            <hr>
        </c:forEach>
    </body>
</html>
