/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.objects3;

/**
 *
 * @author Mike
 */
public class Car extends Vehicle{
    private String fuelType;
    
    public Car(String fuelType){
        this.fuelType = fuelType;
    }
    
    public final void fillTank(){
        //Fill Tank 
    };
    public final void useFuel(){
        //Use Fuel
    };
    public final void startEngine(){
        //Start Engine
    };
    
    
    public final void setFuelType(String fuelType){
        //Validation
        this.fuelType = fuelType;
    }
    
    public final String getFuelType(){
        return fuelType;
    }
}
