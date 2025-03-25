<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>AgriSmart - Your Advice</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h1>Your Farming Advice</h1>
        <p><strong>Location:</strong> <%= request.getAttribute("location") %></p>
        <p><strong>Weather Forecast:</strong> <%= request.getAttribute("weather") %></p>
        <p><strong>Crop Recommendation:</strong> <%= request.getAttribute("cropAdvice") %></p>
        <p><strong>Resource Tips:</strong> <%= request.getAttribute("resourceTips") %></p>
        <a href="index.html"><button>Back to Home</button></a>
    </div>
</body>
</html>