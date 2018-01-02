<%-- 
    Document   : cookieCreator
    Created on : Dec 3, 2017, 2:10:16 AM
    Author     : jpbur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cookies that were Created</title>
        <link rel="stylesheet" href="css-1.css">
        
        <style type="text/css">
            ol { margin-left: 110px; }
            li { font-size: 1em; text-align: left; }
        </style>
        
    </head>
    <%@include file="cookieCreatorProcessor.jsp" %>
    <body>
        <div class="center">
            <h1>Three Cookies Created</h1>
            <ol>
            <li><p><b>Animal:</b>
                    <%= request.getParameter("animal")%>
            </p></li>  
            <li><p><b>Flower:</b>
                    <%= request.getParameter("flower")%>
            </p></li>
            <li><p><b>Country:</b>
                    <%= request.getParameter("country")%>
            </p></li>
            </ol>
            <button onclick="location.href='readingCookies.jsp'"
                    class="coral_color">Reading Cookies</button>
        </div>       
    </body>
</html>
