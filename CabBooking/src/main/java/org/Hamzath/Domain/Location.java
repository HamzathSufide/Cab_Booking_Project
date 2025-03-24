package org.Hamzath.Domain;

public class Location {
    double longitude;
    double latitude;

    public Location(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
    public double distanceTo(Location other) {
        return Math.sqrt(Math.pow(this.latitude - other.latitude, 2) +
                Math.pow(this.longitude - other.longitude, 2));
    }
}
