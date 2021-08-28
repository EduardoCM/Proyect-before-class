<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Create new account</h1>

<form action="createaccount" method="post">
        <table>
          <tr>
               <td>Nombre: </td>
               <td><input type="text" name="nombre"> </td>
          </tr>
          
          <tr>
               <td>Apellidos: </td>
               <td><input type="text" name="apellidos"> </td>
          </tr>
          
          <tr>
               <td>usuario: </td>
               <td><input type="text" name="usuario"> </td>
          </tr>
          
          <tr>
               <td>Contraseña: </td>
               <td><input type="text" name="contrasena"> </td>
          </tr>
          
          <tr>
               <td>Email: </td>
               <td><input type="text" name="email"> </td>
          </tr>
          
          <tr>
               <td>Telefono: </td>
               <td><input type="text" name="telefono"> </td>
          </tr>
          
          <tr>
               <td></td>
               <td><button type="submit">Registrar</button></td>
          </tr>
        
        </table>
    </form>

</body>
</html>