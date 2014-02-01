<%-- 
    Document   : result
    Created on : Jan 24, 2014, 6:50:28 PM
    Author     : schereja
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area of Rectangle</title>
    </head>
    <body>
        <%
            String firstLine = "Your result is: ";
         
            Object answer = request.getAttribute("result");
            String stringAnswer = answer.toString();
            Object shape = request.getAttribute("shape");
            String stringShape = shape.toString();
            %>
    <br /> 
    <h1><%=firstLine%></h1>
    <br/>
    <h1><%=stringAnswer%></h1>
    
    <a href="index.html">Go back</a>
    </body>
</html>
