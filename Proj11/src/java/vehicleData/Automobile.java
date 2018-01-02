/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleData;

/**
 *
 * @author jpbur
 */
public class Automobile {
    private String numDoors;
    private String totalOccupants;
    private String mpg;
    private String transType;
    
    // CONSTRUCTORS
    public Automobile(){
        numDoors = "";
        totalOccupants = "";
        mpg = "";
        transType = "";        
    }
    public Automobile(String numDoors, String totalOccupants,
                      String mpg, String transType) {
        this.numDoors = numDoors;
        this.totalOccupants = totalOccupants;
        this.mpg = mpg;
        this.transType = transType;
    }
    
    public void setNumDoors(String numDoors) {
        this.numDoors = numDoors;
    }
    public String getNumDoors(){ return numDoors; }
    
    public void setTotalOccupants(String totalOccupants){
        this.totalOccupants = totalOccupants;
    }
    public String getTotalOccupants(){ return totalOccupants; }
    
    public void setMpg(String mpg){
        this.mpg = mpg;
    }
    public String getMpg() { return mpg; }

    public void setTransType(String transType){
        this.transType = transType;
    }
    public String getTransType() { return transType; }
    
}// end class Automobile
