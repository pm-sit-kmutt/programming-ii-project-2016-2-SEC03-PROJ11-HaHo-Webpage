<%-- 
    Document   : showList
    Created on : Nov 7, 2015, 11:03:51 AM
    Author     : Matus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Show list</h1>
        <form action = 'showThread' method = 'get'>
            <input type = 'text' name = 'threadId' >
            <input type = 'submit' value = 'findPage'>
        </form>
    </body>
</html>
