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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        //needs validation to check if legal level change.
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        //needs validation to check if health increase is legal.
        this.health = health;
    }
    
    
}
