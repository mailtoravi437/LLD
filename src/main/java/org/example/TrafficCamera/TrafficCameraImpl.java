package org.example.TrafficCamera;
import java.util.*;

public class TrafficCameraImpl implements TrafficCamera {
    private List<TrafficManagementCenter> observers;
    public TrafficCameraImpl(){
        observers = new ArrayList<TrafficManagementCenter>();
    }


    @Override
    public void addObserver(TrafficManagementCenter observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(TrafficManagementCenter observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String location, String status) {
        for (TrafficManagementCenter observer : observers){
            observer.update(location, status);
        }
    }

    public void detectCongestion(String location){
        System.out.println("Congestion detected");
        notifyObservers(location, String.valueOf(true));
    }
}
