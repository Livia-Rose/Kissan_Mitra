package com.agri;

public class FarmerData {
    private String location;
    private double landSize;
    private String soilCondition;

    public FarmerData(String location, double landSize, String soilCondition) {
        this.location = location;
        this.landSize = landSize;
        this.soilCondition = soilCondition;
    }

    // Getters and setters
    public String getLocation() { return location; }
    public double getLandSize() { return landSize; }
    public String getSoilCondition() { return soilCondition; }
}