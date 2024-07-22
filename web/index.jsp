<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="http://localhost:8080/EEApplication/Servlet" method="get">
            Name: <input type="text" name="name"/>
            <button type="submit">Submit</button>
        </form>

        <form action="http://localhost:8080/EEApplication/Cookies" method="get">
            Age: <input type="text" name="age"/>
            <button type="submit">Submit</button>
        </form>

        <p>Welcome visitor no.</p>
    </body>
</html>