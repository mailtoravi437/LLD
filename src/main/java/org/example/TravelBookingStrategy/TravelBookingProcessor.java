package org.example.TravelBookingStrategy;

public class TravelBookingProcessor {
    private TravelBookingStrategy travelBookingStrategy;

    public void setTravelBookingStrategy(TravelBookingStrategy travelBookingStrategy) {
        this.travelBookingStrategy = travelBookingStrategy;
    }

    public void book(String tye){
        travelBookingStrategy.book(tye);
    }
}
