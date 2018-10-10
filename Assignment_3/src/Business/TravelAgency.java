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
public class TravelAgency {

    public TravelAgency() {
        this.airlinerList = new ArrayList<Airliner>();
        this.officeList = new ArrayList<travelOffice>();
    }
    
    private ArrayList<Airliner>airlinerList;
    private ArrayList<travelOffice> officeList;

    public ArrayList<Airliner> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<Airliner> airlinerList) {
        this.airlinerList = airlinerList;
    }

    public ArrayList<travelOffice> getOfficeList() {
        return officeList;
    }

    public void setOfficeList(ArrayList<travelOffice> officeList) {
        this.officeList = officeList;
    }

    public Airliner addAirliner() {
        Airliner al = new Airliner();
        airlinerList.add(al);
        return al;
           }
    
    
    
}
