<!DOCTYPE html>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <% out.print("BIENVENIDOS A JSP");
        int a = 10;
        int b = 20;
        int suma = a+b;
        out.print("<h1>La suma de" +a+ "+" +b+ "=" + suma + "</h1" );
        %>
        <h1> Esta es la pÃ¡gina de inicio</h1>
        <h2> Aqui se piden los datos </h2> 
        <p> Hola, por favor introduce la informaciòn </p>
        <form action="recibir.do" method="post">  
        <table cellspacing="3" cellpadding="3" border="1" >   
         <tr>   
        <td align="right"> Nombre: </td> 
        <td><input type="text" name="nombre"></td> 
        </tr>   
        <tr>  
        <td align="right"> Color favorito: </td> 
        <td> <input type="text" name="color"> </td> 
        </tr> 
        <tr>  
        <td align="right"> Correo: </td> 
        <td> <input type="text" name="mail"> </td> 
        </tr>   
        </table>  
        <input type="reset" value="Borrar">  
        <input type="submit" value="Enviar"> 
        </form> 
    </body>
</html>
