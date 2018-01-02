<%-- 
    Document   : readingCookies
    Created on : Dec 3, 2017, 2:45:33 AM
    Author     : jpbur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reading Cookies</title>
        <link rel="stylesheet" href="css-1.css">
    </head>
    <body>
        <div class="center">
            <h1>Reading Cookies</h1>
            <%
                Cookie cookies[] = null;
                // Get an array of Cookies associated with this domain
                cookies = request.getCookies();
                if( cookies != null ) {
                    out.println("<h2 class=\"blue_color\">" + "Found Cookies: Name --- Value</h2>");
                    for (int i = 0; i < cookies.length; i++) {
                        out.print("<h3>Name: " + cookies[i].getName() + "  ---  ");
                        out.print("Value: " + cookies[i].getValue() + "</h3>");
                    }
                }
                else { out.println("<h2>No Cookies Found</h2>"); }
            %>
            <button onclick="location.href='sessionCreation.jsp'" class="coral_color">
                Continue to Sessions Creation
            </button>            
        </div>       
    </body>
</html>
