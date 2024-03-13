package org.example.TrafficCamera;

public class Main {
    public static void main(String[] args){
        TrafficCamera camera = new TrafficCameraImpl();
        TrafficManagementCenter center = new TrafficManagementCenterImpl("Kolmogor");
        camera.addObserver(center);

    }
}
