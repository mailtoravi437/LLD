package org.example.TrafficCamera;

public class TrafficManagementCenterImpl implements TrafficManagementCenter{

    private String name;


    public TrafficManagementCenterImpl(String name){
        this.name = name;
    }
    @Override
    public void update(String location, String status) {
        System.out.println("Location: " + location);
        System.out.println("Status: " + status);
    }
}
