package org.Hamzath.Domain;

public class Cab {
    private String id;
    Location location;
    boolean isAvailable;
    public Cab(String id, Location location) {
        this.id = id;
        this.location = location;
        this.isAvailable = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
