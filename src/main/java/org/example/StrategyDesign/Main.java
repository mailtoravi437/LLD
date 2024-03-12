package org.example.StrategyDesign;

import org.example.StrategyDesign.Strategy.DriveStrategy;
import org.example.StrategyDesign.Strategy.SportsDriveStrategy;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new SportsCar();
        vehicle.drive();

    }

    public static class SportsCar extends Vehicle {
        SportsCar(){
            super(new SportsDriveStrategy());
        }
    }

    public static class Vehicle {
        DriveStrategy driveStrategy;
        Vehicle(DriveStrategy driveStrategy) {
            this.driveStrategy = driveStrategy;;
        }

        public void drive(){
            driveStrategy.drive();
        }
    }
}
