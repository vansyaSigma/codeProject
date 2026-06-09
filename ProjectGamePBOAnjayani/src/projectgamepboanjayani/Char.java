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
    private int darah;
    private String nama;
    private int damage;
    private String elemen;
    private int elemenDamage;
    private int mana;

    public Char(String nama, int darah, int damage, int mana) {
        this.nama = nama;
        this.darah = darah;
        this.damage = damage;
        this.mana = mana;
    }

    public Char(String nama, int darah, int damage, String elemen, int elemenDamage) {
        this.nama = nama;
        this.darah = darah;
        this.damage = damage;
        this.elemen = elemen;
        this.elemenDamage = elemenDamage;
    }

    public void Serang(Char target) {
        System.out.println(this.nama + " menyerang " + target.nama + " sebesar " + this.damage + " HP!");
        target.menerimaDamage(this.damage);
    }

    public void menerimaDamage(int damage) {
        this.darah -= damage;
        if (this.darah < 0) this.darah = 0;
        System.out.println(this.nama + " sekarang memiliki " + this.darah + " HP!\n");
    }

    public void monsterSerang(Char target) {
        System.out.println("Monster menyerangmu!!");
        System.out.println(this.nama + " menyerang " + target.nama + " sebesar " + this.damage + " HP!");
        target.menerimaDamage(this.damage);
    }

    public void heal() {
        this.darah += 20;
        if (this.darah > 100) this.darah = 100;
    }

    public void isAlive() {
        if (this.darah <= 0) {
            return;
        }
    }

}
