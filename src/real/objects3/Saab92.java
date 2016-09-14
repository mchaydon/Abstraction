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
public class Saab92 extends Car{
    String fuelType = "Gasoline";
    
    public Saab92(String fuelType) {
        super(fuelType);
    }
    
    public final void buildBoost() {
        //Build boost pressure
    }    
}
