<%-- 
    Document   : result
    Created on : 16 mai 2015, 23:35:36
    Author     : macbookpro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultat</title>
    </head>
    <body>
        <h1>Le résultat de votre opération est : </h1>
        <h3>
            <% if(request.getAttribute("reel")!=null && request.getAttribute("img")!=null ) {
                    out.println(request.getAttribute("reel"));
                    out.println(" + ");
                    out.println(request.getAttribute("img"));
                    out.println(" x i ");
                }   
            %>
        </h3>
        <% if(request.getAttribute("module") != null) {
        out.println(request.getAttribute("module"));}%>
        <% if(request.getAttribute("conjugue") != null) {
        out.println(request.getAttribute("conjugue"));}%>
    </body>
</html>
