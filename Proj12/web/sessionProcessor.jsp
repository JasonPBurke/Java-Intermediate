<%-- 
    Document   : sessionProcessor
    Created on : Dec 4, 2017, 10:07:34 PM
    Author     : jpbur
--%>

<%
    // Get session creation time
    Date createTimeValue = new Date(session.getCreationTime());
    // Get last access time
    Date lastAccessTimeValue = new Date(session.getLastAccessedTime());
    String title = "Welcome Back";
    Integer visitCountValue = 0;
    

%>
