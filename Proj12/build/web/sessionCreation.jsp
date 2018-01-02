<%-- 
    Document   : sessionCreation
    Created on : Dec 4, 2017, 9:54:30 PM
    Author     : jpbur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Session Creation</title>
        <link rel="stylesheet" href="css-1.css">
    </head>
    <%@ page import="java.util.*" %>
    <body>
        <div class="center">
            <h1>Session Creation</h1>
            <h1>Enter Session Data</h1>
            <form action="sessionCreation.jsp" method="GET">
                <table class="inline-block">
                    <tr><th id="th-id2" colspan="2">Create Session Objects</th></tr>
                    <tr>
                        <td>Artist</td>
                        <td><input type="text" name="artist"></td>
                    </tr>
                    <tr>
                        <td>Color</td>
                        <td><input type="text" name="color"></td>
                    </tr>
                        <td></td>
                        <td><br><input type="submit" class="coral_color"
                                       value="Create Sessions"></td>
                    </tr>
                </table>
            </form>
            <%
                String artist = request.getParameter("artist");
                String color = request.getParameter("color");
                session.setAttribute("artist", artist);
                session.setAttribute("color", color);
            %>
        </div>
        <table class="center">
            <tr><th id="th-id2" colspan="2">Session Data</th></tr>           
            <tr>
                <td>Artist</td>
                <td><% out.print(session.getAttribute("artist")); %></td>
            </tr>
            <tr>
                <td>Color</td>
                <td><% out.print(session.getAttribute("color")); %></td>
            </tr>            
        </table>
    </body>
</html>
