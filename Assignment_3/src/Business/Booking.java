/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import UserInterface.ManageAirliners.ManageAirplaneJPanel;

/**
 *
 * @author ankitaroy
 */
public class Booking {
    
    int maxBookingId=0;
     private Airliner airliner;
    private Airplane airplanes;
    private flight flight;
    private int bookingID;
    private seat seat;
    private customer customer;

    public Booking(Airliner airliner, ManageAirplaneJPanel airPlaneDirectory, flight flight, seat seat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMaxBookingId() {
        return maxBookingId;
    }

    public void setMaxBookingId(int maxBookingId) {
        this.maxBookingId = maxBookingId;
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }

    public Airplane getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(Airplane airplanes) {
        this.airplanes = airplanes;
    }

    public flight getFlight() {
        return flight;
    }

    public void setFlight(flight flight) {
        this.flight = flight;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public seat getSeat() {
        return seat;
    }

    public void setSeat(seat seat) {
        this.seat = seat;
    }

    public customer getCustomer() {
        return customer;
    }

    public void setCustomer(customer customer) {
        this.customer = customer;
    }
    
    
}
