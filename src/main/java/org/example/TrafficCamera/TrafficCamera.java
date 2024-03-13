package org.example.TrafficCamera;

public interface TrafficCamera{
    void addObserver(TrafficManagementCenter observer);
    void removeObserver(TrafficManagementCenter observer);
    void notifyObservers(String location,String status);
}
