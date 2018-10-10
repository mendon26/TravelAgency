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
public class flight {
    private ArrayList<seat>seatList;
    private int id;
    
    public flight() {
        this.seatList=new ArrayList();
    }
    private String name;
    private String source;
    private String destination;
    
    
    public ArrayList<seat> getSeatList(){
        return seatList;
      }
    public void setSeatList(ArrayList<seat>seatList){
     this.seatList = seatList;
    }
    
    public seat addseat(){
              seat seat=new seat();
         seatList.add(seat);
         return seat;
         }
    
    public int getId(){
         return id;
     }
     
    public void setId(int id){
         this.id=id;
         
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int TotalRevenue()
    {
        int total=0;
        for(seat vs: seatList){
    if(!vs.isAvailabiity())
        total+=vs.getPrice();
    }
    return total;
}}