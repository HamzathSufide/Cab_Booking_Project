package org.Hamzath.Domain;

import java.util.Comparator;

class CabComparator implements Comparator<Cab> {
    private Location userLocation;

    public CabComparator(Location userLocation) {
        this.userLocation = userLocation;
    }

    public int compare(Cab cab1, Cab cab2) {
        double dist1 = userLocation.distanceTo(cab1.location);
        double dist2 = userLocation.distanceTo(cab2.location);
        return Double.compare(dist1, dist2);
    }
}
