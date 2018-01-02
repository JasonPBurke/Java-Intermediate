<%-- 
    Document   : display_new_member
    Created on : Nov 21, 2017, 9:12:30 PM
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
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phoneNumber = request.getParameter("phoneNumber");
        String collegeName = request.getParameter("collegeName");
        %>
        <div class="center">
            <h1>Thank you for entering your student info.</h1>
            <h2>This is the information entered:</h2>
            <table class="center">
                <tr><th id="th-id1" colspan="2">Information Entered</th></tr>
                <tr>
                    <td>First Name:</td>
                    <td><%= firstName %></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><%= lastName %></td>
                </tr>
                <tr>
                    <td>Phone Number:</td>
                    <td><%= phoneNumber %></td>
                </tr>
                <tr>
                    <td>College Name:</td>
                    <td><%= collegeName %></td>
                </tr>
            </table>
            <p>To enter new data, select the button below.</p>
            <form action="index.html" method="get">
                <input type="submit" value="Enter New Data">
            </form>
        </div>        
    </body>
</html>
