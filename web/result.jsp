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
        Your area for the rectangle is: 
        <%
        List result = (List)request.getAttribute("area");
        Iterator it = result.iterator();
        while(it.hasNext()) {
            out.print(it.next());
        }
    %>
    <br /> 
    <a href="index.html">Go back</a>
    </body>
</html>
