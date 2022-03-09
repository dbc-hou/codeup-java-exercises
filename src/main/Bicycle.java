package main;

public class Bicycle {
    private String make = "Jamis";
    private String model = "Allegro";
    private String color = "Dynamo orange";
    private String type = "hybrid";
    private int numGears = 24;
    private double velocity = 0;
    private double frameSizeCentimeters = 57;
    private boolean hasLights = true;
    private String favoriteSong = "Bicycle Races";

    public Bicycle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    public boolean isHasLights() {
        return hasLights;
    }

    public void setHasLights(boolean hasLights) {
        this.hasLights = hasLights;
    }

    public String getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFrameSizeCentimeters() {
        return frameSizeCentimeters;
    }

    public void setFrameSizeCentimeters(double frameSizeCentimeters) {
        this.frameSizeCentimeters = frameSizeCentimeters;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public void accelerate (double changeVelocity) {
        if (velocity == 0 && changeVelocity < 0) {
            velocity = 0;
        }
        if (changeVelocity < 0) {
            velocity -= changeVelocity;
        } else {
            velocity += changeVelocity;
        }
    }
}
