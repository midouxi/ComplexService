<%-- 
    Document   : accueil
    Created on : 16 mai 2015, 18:37:56
    Author     : macbookpro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calcul Nombre Complexe</h1>
        <form action="/WebApplication3/ResultServlet" method="get">
        1st Complex Number : a : <input name="reel1" required/>+i x b : <input name="img1" required/><br />
        2nd Complex Number : a : <input name="reel2" value="0"/>+i x b : <input name="img2" value="0"/><br />
        <select class="form-control" name="operation" id="operation"  tabindex="7" required>
            <option value="" selected>--Choisir--</option>
            <option value="somme">Somme</option>
            <option value="multiplication">Multiplication</option>
            <option value="soustraction">Soustraction</option>
            <option value="module">Module (du 1er Nbr)</option>
            <option value="conjugue">Conjugué (du 1er Nbr)</option>
        </select>
        <input type="submit"/>
        </form>
    </body>
</html>
