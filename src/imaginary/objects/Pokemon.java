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

    public abstract void setLevel(int level);

    public abstract int getHealth();

    public abstract void setHealth(int health);
 
}
