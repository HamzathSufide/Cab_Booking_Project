package org.Hamzath.Domain;

import java.util.PriorityQueue;

public class CabFinder {
    private PriorityQueue<Cab> minHeap;

    public CabFinder(Location userLocation) {
        this.minHeap = new PriorityQueue<>(10, new CabComparator(userLocation));
    }

    public void addCab(Cab cab) {
        minHeap.add(cab);
    }

    public Cab findNearestCab() {
        return minHeap.isEmpty() ? null : minHeap.poll();
    }
}
