package org.example.TravelBookingStrategy;

public class Main {
    public static void main(String[] args){
        TravelBookingProcessor processor = new TravelBookingProcessor();
        processor.setTravelBookingStrategy(new FLightTravelBookingStrategy("10"));
        processor.book("Ravi2");
    }
}
