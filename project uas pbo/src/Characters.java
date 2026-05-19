public class Characters {
    int darah;
    String nama;
    int damage;
    String elemen;
    int elemenDamage;
    int mana;

    public Characters(String nama, int darah, int damage, int mana) {
        this.nama = nama;
        this.darah = darah;
        this.damage = damage;
        this.mana = mana;
    }

    public Characters(String nama, int darah, int damage, String elemen, int elemenDamage) {
        this.nama = nama;
        this.darah = darah;
        this.damage = damage;
        this.elemen = elemen;
        this.elemenDamage = elemenDamage;
    }

    public void Serang(Characters target) {
        System.out.println(this.nama + " menyerang " + target.nama + " sebesar " + this.damage + " HP!");
        target.menerimaDamage(this.damage);
    }

    public void menerimaDamage(int damage) {
        this.darah -= damage;
        if (this.darah < 0) this.darah = 0;
        System.out.println(this.nama + " sekarang memiliki " + this.darah + " HP!\n");
    }

    public void monsterSerang(Characters target) {
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