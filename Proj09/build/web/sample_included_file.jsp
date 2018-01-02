<%-- 
    Document   : sample_included_file
    Created on : Nov 15, 2017, 3:07:01 AM
    Author     : jpbur
--%>
<%-- sample_included_file.jspp --%>
<hr>
<h2>Hello from included file: sample_included_file.jsp</h2>
<% 
    System.out.println("Printed from Java...");
    Date date = new Date();
%>
<h2>Hello!  Time from an included file: <%= date %></h2>
<hr>
