<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
    <head>
        <!-- Access the bootstrap Css like this,
            Spring boot will handle the resource mapping automcatically -->
        <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

    </head>
    <body>
        <form action="processForm" method="GET">
            <input type="text" name="studentName"
                placeholder="what's your name?" class="input"/>

            <input type="submit" class="btn btn-primary"/>
        </form>
    </body>
</html>