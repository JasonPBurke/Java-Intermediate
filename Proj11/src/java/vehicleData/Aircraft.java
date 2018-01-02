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
public class Aircraft {
    private String maxWeight;
    private String numSeats;
    private String flightRange;
    private String engineType;
    
    public Aircraft() {
        maxWeight = "";
        numSeats = "";
        flightRange = "";
        engineType = "";
    }
    public Aircraft(String maxWeight, String numSeats,
                    String flightRange, String engineType ) {
        this.maxWeight = maxWeight;
        this.numSeats = numSeats;
        this.flightRange = flightRange;
        this.engineType = engineType;
    }
    
    public void setMaxWeight(String maxWeight){
        this.maxWeight = maxWeight;
    }
    public String getMaxWeight() { return maxWeight; }
    
    public void setNumSeats(String numSeats) {
        this.numSeats = numSeats;
    }
    public String getNumSeats() { return numSeats; }
    
    public void setFlightRange(String flightRange) {
        this.flightRange = flightRange;
    }
    public String getFlightRange() { return flightRange; }
    
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public String getEngineType() { return engineType; }
            
}// end class Aircraft
