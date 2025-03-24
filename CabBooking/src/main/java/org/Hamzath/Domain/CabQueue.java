package org.Hamzath.Domain;

import java.util.LinkedList;
import java.util.Queue;

public class CabQueue {
    private Queue<Cab> cabQueue;

    public CabQueue() {
        cabQueue = new LinkedList<>();
    }

    public void addCab(Cab cab) {
        cabQueue.add(cab);
    }

    public Cab assignCab() {
        return cabQueue.isEmpty() ? null : cabQueue.poll();
    }
}
