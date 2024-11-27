<%-- 
    Document   : Login
    Created on : 4 nov 2024, 16:45:56
    Author     : Javier
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Iniciar Sesi�n - PlayCheck</title>
    <link rel="stylesheet" href="assets/css/login.css">
</head>
<body>
    <!-- Nombre de la aplicaci�n fuera del contenedor del formulario -->
    <h1 class="app-name">PlayCheck</h1>
    
    <div class="login-container">
        <h2>Iniciar Sesi�n</h2>

        <!-- Mensaje de error si las credenciales son incorrectas -->
        <c:if test="${not empty errorMessage}">
            <p class="error-message">${errorMessage}</p>
        </c:if>

        <!-- Formulario de inicio de sesi�n -->
        <form method="post">
            <label for="username">Nombre de usuario:</label>
            <input type="text" id="username" name="username" required>

            <label for="password">Contrase�a:</label>
            <input type="password" id="password" name="password" required>

            <button type="submit" class="login-button">Iniciar Sesi�n</button>
        </form>

        <!-- Bot�n de registro -->
        <button onclick="location.href='Registro'" class="register-button">Registro</button>
    </div>
</body>
</html>

