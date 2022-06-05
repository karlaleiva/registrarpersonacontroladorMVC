

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Personas</h1>
        <form action="recibir.do" method="POST">
        DUI:<input type="text" name="txtDui" value="" /><br>
        APELLIDO<input type="text" name="txtApellido" value="" /><br>
        <input type="text" name="txtNombre" value="" /><br>
        <input type="submit" name="Registrar Nueva Persona"  /><br>
        </form>
    </body>
</html>
