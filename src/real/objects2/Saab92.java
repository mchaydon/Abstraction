/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.objects2;

/**
 *
 * @author Mike
 */
public class Saab92 extends Car{
    String fuelType = "Gasoline";

    public Saab92(String fuelType) {
        super(fuelType);
    }
    
    @Override
    public final void fillTank() {
        //Fill Tank
    }

    @Override
    public final void useFuel() {
        //Use Fuel
    }

    @Override
    public final void move() {
        //Move
    }

    @Override
    public final void startEngine() {
        //Start engine
    }
    
    public final void buildBoost() {
        //Build boost pressure
    }   
}
