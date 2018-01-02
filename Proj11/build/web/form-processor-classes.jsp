<%-- 
    Document   : form-processor-classes
    Created on : Nov 24, 2017, 7:03:56 PM
    Author     : jpbur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="vehicleData.*, java.io.*, java.util.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display New Automobile and Aircraft Data</title>
        <link rel="stylesheet" href="css-1.css">
    </head>
    <body>
        <% 
          // get parameters from the request object to populate both class objs
          String autoNumDoors = request.getParameter("autoNumDoors");
          String autoTotalOccupants = request.getParameter("autoTotalOccupants");
          String autoMpg = request.getParameter("autoMpg");
          String autoTransType = request.getParameter("autoTransType");
          String airMaxWeight = request.getParameter("airMaxWeight");
          String airNumSeats = request.getParameter("airNumSeats");
          String airFlightRange = request.getParameter("airFlightRange");
          String airEngineType = request.getParameter("airEngineType");
          
          //Set filePath to a relitave file name..USED FOR SAVING TO TXT FILE
          //ServletContext sc = this.getServletContext();
          //String filePath = sc.getRealPath("/WEB-INF/Air_Auto_Info.txt");
          
          // instantiate new Java objects to use in the output of data
          Automobile automobile = new Automobile(autoNumDoors, autoTotalOccupants,
                                                 autoMpg, autoTransType);
          Aircraft aircraft = new Aircraft(airMaxWeight, airNumSeats,
                                           airFlightRange, airEngineType);         
        %>
        
        <div class="center">
            <h1>Thank you for saving the vehicle data.</h1>
            <h2>Here is the information entered:</h2>
            <table class="center">
                <tr><th id="th-id2" colspan="2">Automobile Information Entered</th></tr>
                <tr>
                    <td>Number of Doors:</td>
                    <td><%= automobile.getNumDoors() %></td>
                </tr>
                <tr>
                    <td>Total Occupants:</td>
                    <td><%= automobile.getTotalOccupants() %></td>
                </tr>
                <tr>
                    <td>Miles Per Gallon:</td>
                    <td><%= automobile.getMpg() %></td>
                </tr>
                <tr>
                    <td>Drive Type:</td>
                    <td><%= automobile.getTransType() %></td>
                </tr>
                <tr><th id="th-id1" colspan="2">Aircraft Information Entered</th></tr>
                <tr>
                    <td>Maximum Weight Capacity:</td>
                    <td><%= aircraft.getMaxWeight() %></td>
                </tr>
                <tr>
                    <td>Number of Seats:</td>
                    <td><%= aircraft.getNumSeats() %></td>
                </tr>
                <tr>
                    <td>Maximum Flight Range:</td>
                    <td><%= aircraft.getFlightRange() %></td>
                </tr>
                <tr>
                    <td>Engine Type:</td>
                    <td><%= aircraft.getEngineType() %></td>
                </tr>
            </table>
            <p>To return to data entry screen, select the button below.</p>
            <form action="index.html" method="get">
                <input type="submit" class="table_header" value="Enter New Data">
            </form>
        </div>        
    </body>
</html>
