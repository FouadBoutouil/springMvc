<%-- 
    Document   : my-film-list
    Created on : 2 août 2018, 15:51:19
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Liste des films</h1>
        <c:forEach items="${mesFilms}" var="filmAct" >
            ${filmAct.titre}
            <br>
        </c:forEach>
            <br><br>
            
            
            <a href="<c:url value="/my-film-form"/>"> Lien vers controlleur</a>
            
    </body>
</html>
