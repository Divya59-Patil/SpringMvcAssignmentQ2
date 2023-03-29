<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Interest Calculator</title>
</head>
<body>
    <form action="calculateSimpleInterest" method="post">
        <label>Principal amount:</label>
        <input type="number" name="principalAmount" required><br><br>
        <label>No. of years:</label>
        <input type="number" name="numberOfYears" required><br><br>
        <label>Rate of interest:</label>
        <input type="number" name="rateOfInterest" required><br><br>
        <input type="submit" value="Calculate Simple Interest">
    </form>
</body>
</html>