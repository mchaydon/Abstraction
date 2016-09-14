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
public abstract class Pokemon implements Creature {
    public int level;
    public int health;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        //needs validation
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        //needs validation
        this.health = health;
    }
 
}
