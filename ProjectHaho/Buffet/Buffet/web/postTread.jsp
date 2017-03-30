<%-- 
    Document   : postTread
    Created on : Nov 7, 2015, 12:52:00 AM
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
        <h1>TestPost </h1>
        <form action = 'testPost' method = 'post' enctype= "MULTIPART/FORM-DATA" >
          Header  <input type = "text" name = "header" /> <br>
            Body <input type = "text" name = "body" /><br>
             image <input type="file" name="imagepath" />
             Tags <input type = "text" name = "tags" />
            <input type = "submit" value = "! POST !">
            
        </form>
    </body>
</html>
