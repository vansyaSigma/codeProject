/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgamepboanjayani;

/**
 *
 * @author user
 */
public class Char {
    private int darah, damage, elemendamage, mana;
    private String nama, elemen;
    
    public Char (int darah, int damage, int mana, String elemen){
        this.darah = darah;
        this.damage = damage;
        this.mana = mana;
        this.elemen = elemen;
    }
    
    public int getDarah(){
        return darah;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public int getMana(){
        return mana;
    }

    public int heal() {
        if (darah > 100) 
            darah = 100;
        else
            darah -= damage;
        return darah;
    }

    public Boolean isAlive() {
        if (darah <= 0) {
            return true;
        } else {
            return false;
        }
    }

}
