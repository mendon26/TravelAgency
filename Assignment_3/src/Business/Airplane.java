/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ankitaroy
 */
public class Airplane {
    private ArrayList<flight>flightList;
    private String ModelNumber;
    private String Manufacturer;

    public ArrayList<flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<flight> flightList) {
        this.flightList = flightList;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public void setModelNumber(String ModelNumber) {
        this.ModelNumber = ModelNumber;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }
    public Airplane(){
        this.flightList=new ArrayList();
    }
    
    public ArrayList<flight>getflightList(){
        return flightList;
    }
    
    public void setflightList(ArrayList<flight> flightList){
        this.flightList=flightList;
    }
    public int totalRevenue(){
        int total =0;
        for(flight vs:flightList){
            total+=vs.TotalRevenue();
        }
        return total;
    }
           
    public flight addFlight(){
 
    flight flight = new flight();
    flightList.add(flight);
    return flight;
    
    }
    
    public String toString(){
        return String.valueOf(this.Manufacturer);
    }
                  
              }
                      
               
           
    
    
    
    
    

