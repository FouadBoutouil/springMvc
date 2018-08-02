<%-- 
    Document   : my-film-form
    Created on : 2 août 2018, 16:09:19
    Author     : Administrateur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Formulaire 2.0 (^__^) </h1>
        <!-- mon formulaire-->
        
        <form:form modelAttribute="film">
            <label>Titre</label>
            <form:input path="titre"/>
            <label>Synopsis</label>
            <form:textarea path="synopsis"/>
            <form:select items="${genres}" itemLabel="nom" itemValue="id" path="genre.id"/>
            <input type="submit">
            
        </form:form>
        
        
    </body>
</html>
