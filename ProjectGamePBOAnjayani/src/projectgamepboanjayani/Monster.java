/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectgamepboanjayani;

/**
 *
 * @author user
 */
public class Monster extends Char {
    private static final int max_darah = 85;

    public void monsterSerangElemen(Characters target) {
        System.out.println("Monster menyerangmu!!");
        System.out.println(this.nama + " menyerang " + target.nama + " dengan elemen " + this.elemen + " sebesar " + this.elemenDamage + " HP!");
        target.menerimaDamage(this.damage);
    }
}
