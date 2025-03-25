package com.agri;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/agriSmart")
public class AgriSmartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Get form data
        String location = request.getParameter("location");
        double landSize = Double.parseDouble(request.getParameter("landSize"));
        String soilCondition = request.getParameter("soilCondition");

        // Simulate AI logic (replace with real ML/API integration later)
        String weatherForecast = simulateWeather(location);
        String cropAdvice = suggestCrop(landSize, soilCondition, weatherForecast);
        String resourceTips = optimizeResources(landSize);

        // Set attributes for JSP
        request.setAttribute("location", location);
        request.setAttribute("weather", weatherForecast);
        request.setAttribute("cropAdvice", cropAdvice);
        request.setAttribute("resourceTips", resourceTips);

        // Forward to result page
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    private String simulateWeather(String location) {
        // Simulate weather API response
        if (location.equalsIgnoreCase("Siddharthnagar")) {
            return "Erratic rainfall expected, 30°C average temperature.";
        } else if (location.equalsIgnoreCase("Balrampur")) {
            return "Dry spell predicted, 32°C average temperature.";
        }
        return "Normal weather, 28°C average temperature.";
    }

    private String suggestCrop(double landSize, String soilCondition, String weather) {
        // Simulate AI-driven crop suggestion
        if (soilCondition.equals("Low Fertility") && weather.contains("Dry")) {
            return "Plant moong dal (pulse crop) for this season.";
        } else if (landSize < 1.0) {
            return "Opt for short-duration rice or vegetables.";
        }
        return "Consider wheat or maize based on current conditions.";
    }

    private String optimizeResources(double landSize) {
        // Simulate resource optimization
        return "Use " + (landSize * 10) + " kg of seeds and irrigate twice weekly.";
    }
}