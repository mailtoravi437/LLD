package org.example.TravelBookingStrategy;

public class TrainTravelBookingStrategy implements TravelBookingStrategy{
    @Override
    public void book(String tye) {
        System.out.println("Train"+tye);
    }
}
