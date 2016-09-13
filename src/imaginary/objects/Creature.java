/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary.objects;

/**
 *
 * @author Mike
 */
public interface Creature {
    public abstract void speak();
    public abstract void setName(String name);
    public abstract String getName();
    
    public abstract void move();
}
