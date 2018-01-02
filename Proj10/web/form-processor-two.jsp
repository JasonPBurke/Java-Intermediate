<%-- 
    Document   : form-processor-two
    Created on : Nov 21, 2017, 10:29:15 PM
    Author     : jpbur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.io.*, java.util.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display New Member</title>
        <link rel="stylesheet" href="css-1.css">
    </head>
    <body>        
        <%
        // get parameters form the request object
        String favoriteSport = request.getParameter("favoriteSport");
        String favoriteTeam = request.getParameter("favoriteTeam");
        String favoritePlayer = request.getParameter("favoritePlayer");
        String reasonFavorite = request.getParameter("reasonFavorite");
        %>
        <div class="center">
        <h1>Thank you for telling us about yourself</h1>
        <h2>This is the information entered:</h2>
        <table class="center">
            <tr><th id="th-id1" colspan="2">Information Entered</th></tr>
            <tr>
                <td>Favorite Sport:</td>
                <td><%= favoriteSport %></td>
            </tr>
            <tr>
                <td>Favorite Team:</td>
                <td><%= favoriteTeam %></td>
            </tr>
            <tr>
                <td>Favorite Player:</td>
                <td><%= favoritePlayer %></td>
            </tr>
            <tr>
                <td>Reason they are your favorite:</td>
                <td><%= reasonFavorite %></td>
            </tr>

        </table>
            <p>To return to forms page, select the button below.</p>
            <form action="index.html" method="get">
                <input type="submit" value="Enter New Info">
            </form>
        </div>        
    </body>
</html>

