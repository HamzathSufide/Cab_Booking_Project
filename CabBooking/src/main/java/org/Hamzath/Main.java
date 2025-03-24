package org.Hamzath;

import org.Hamzath.Domain.Cab;
import org.Hamzath.Domain.CabFinder;
import org.Hamzath.Domain.CabQueue;
import org.Hamzath.Domain.Location;

public class Main {
    public static void main(String[] args) {

        Location userLocation = new Location(13.9716, 77.5946); // Bangalore

        // Cabs
        Cab cab1 = new Cab("CAB101", new Location(12.9700, 77.5900));
        Cab cab2 = new Cab("CAB102", new Location(12.9750, 77.6000));
        Cab cab3 = new Cab("CAB103", new Location(12.9750, 77.5950));

        // Finding the nearest cab using Priority Queue
        CabFinder cabFinder = new CabFinder(userLocation);
        cabFinder.addCab(cab1);
        cabFinder.addCab(cab2);
        cabFinder.addCab(cab3);

        Cab nearestCab = cabFinder.findNearestCab();
        if (nearestCab != null) {
            System.out.println("Nearest Cab: " + nearestCab.getId());
        }

        // Assigning cabs in a queue
        CabQueue cabQueue = new CabQueue();
        cabQueue.addCab(cab2);
        cabQueue.addCab(cab1);
        cabQueue.addCab(cab3);

        Cab assignedCab = cabQueue.assignCab();
        if (assignedCab != null) {
            System.out.println("Assigned Cab: " + assignedCab.getId());
        }
    }
    }
