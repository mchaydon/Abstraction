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
public class Pikachu extends Pokemon{
    private String name;

    public final void run(){
        //Pikachu can run, not all pokemon can run
    }
    
    public final void shock(){
        //Pikachu can shock, not all pokemon can use electric attacks
    }

    @Override
    public void speak() {
        System.out.println("Pikachu!");
    }

    @Override
    public void setName(String name){
        //needs validation
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move() {
        run();
    }

    public final int getLevel() {
        return level;
    }

    public final void setLevel(int level) {
        //needs validation to check if legal level change.
        this.level = level;
    }

    public final int getHealth() {
        return health;
    }

    public final void setHealth(int health) {
        //needs validation to check if health increase is legal.
        this.health = health;
    }
    
    
}
