/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import UserInterface.ManageAirliners.ManageAirplaneJPanel;
import java.util.ArrayList;

/**
 *
 * @author ankitaroy
 */
public class Airliner {
    private ArrayList<Airplane>airPlanelist;
    private String name;

    public ArrayList<Airplane> getAirPlanelist() {
        return airPlanelist;
    }

    public void setAirPlanelist(ArrayList<Airplane> airPlanelist) {
        this.airPlanelist = airPlanelist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
    
    public Airplane addAirplane(){
        Airplane al = new Airplane();
        airPlanelist.add(al);
        return al;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
