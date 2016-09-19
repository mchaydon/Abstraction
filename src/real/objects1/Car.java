/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.objects1;

/**
 *
 * @author Mike
 */
public abstract class Car implements Vehicle{
    private String fuelType;
    
    public Car(String fuelType) { 
       setFuelType(fuelType);
    }
    
    public abstract void fillTank();
    public abstract void useFuel();
    public abstract void startEngine();
    
    
    public final void setFuelType(String fuelType){
        //Validation
        this.fuelType = fuelType;
    }
    
    public final String getFuelType(){
        return fuelType;
    }
    
}
