package org.example.TravelBookingStrategy;

public class FLightTravelBookingStrategy implements TravelBookingStrategy{
    private String seatNumber;

    public FLightTravelBookingStrategy(String seatNumber){
        this.seatNumber = seatNumber;
    }
    @Override
    public void book(String tye) {
        System.out.println("FLight"+tye+seatNumber);
    }
}
