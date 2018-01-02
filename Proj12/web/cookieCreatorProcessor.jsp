<%-- 
    Document   : cookieCreatorProcessor
    Created on : Dec 3, 2017, 2:26:23 AM
    Author     : jpbur
--%>

<%
    // create three cookies from Request object
    Cookie animal = new Cookie("animal", request.getParameter("animal"));
    Cookie flower = new Cookie("flower", request.getParameter("flower"));
    Cookie country = new Cookie("country", request.getParameter("country"));
    
    // Set expiration dates for the cookies to 2hrs
    animal.setMaxAge(60*60*2);
    flower.setMaxAge(60*60*2);
    country.setMaxAge(60*60*2);
    
    // Add cookies to Response object - back to browser
    response.addCookie(animal);
    response.addCookie(flower);
    response.addCookie(country);
%>
