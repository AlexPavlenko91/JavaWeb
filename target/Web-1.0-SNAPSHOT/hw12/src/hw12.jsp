<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>hw 12</title>
</head>
<body>
<h3><%= "Home work 12 Servlets" %>
</h3>
<br/>
<a href="linus-servlet">Linus Torvalds citation(Task 1)</a>
<div style="display-inside: ruby-base-container">
    <form action="${pageContext.request.contextPath}/max3-servlet" method="post" name="calculate">
        <input type="text" id="first" name="first" placeholder="first number" required>
        <input type="text" id="second" name="second" placeholder="second number" required>
        <input type="text" id="third" name="third" placeholder="third number" required>
        <div>
            <input type="radio" id="min" name="math" value="min"
                   checked>
            <label for="min">Min</label>
        </div>
        <div>
            <input type="radio" id="max" name="math" value="max">
            <label for="max">Max</label>
        </div>
        <div>
            <input type="radio" id="arithmetic" name="math" value="arithmetic">
            <label for="arithmetic">Arithmetic mean</label>
        </div>
        <input type="submit" value="Calculate(tasks 2-3)">
    </form>
    <br/>
    <form action="${pageContext.request.contextPath}/textStat-servlet" method="post">
        <input type="text" id="textStat" name="textStat" placeholder="some text" required>
        <input type="submit" value="get statistic(task 4)">
    </form>
    </form>
    <br/>
    <form name="calculator" action="${pageContext.request.contextPath}/calculator-servlet" method="post">
        <input type="text" id="firstNum" name="firstNum" placeholder="some number" required>
        <input type="text" id="sign" name="sign" placeholder="+ - * / % ^" required>
        <input type="text" id="secondNum" name="secondNum" placeholder="some number" required>

        <input type="submit" value="calculate(task 5)">
    </form>
</div>
<br/>
</body>
</html>