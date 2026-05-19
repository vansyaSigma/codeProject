class Hero extends Characters {
    private static final int max_darah = 100;

    public Hero(String nama, int darah, int damage, int mana) {
        super(nama, darah, damage, mana);
    }

    public void heal() {
        this.darah += 20;
        if (this.darah > 100) this.darah = max_darah;
        System.out.println("Kamu meng heal darahmu, darahmu sekarang " + this.darah + "\n");
    }

    public void isAlive() {
        if (this.darah <= 0) {
            System.out.println("Kamu mati, Monster menang!");
            return;
        }
    }
}

class Monster extends Characters {
    private static final int max_darah = 85;

    public Monster(String nama, int darah, int damage, String elemen, int elemenDamage) {
        super(nama, darah, damage, elemen, elemenDamage);
    }

    public void heal() {
        this.darah += 15;
        if (this.darah > 100) this.darah = max_darah;
        System.out.println("monster meng heal darahnya, darahnya menjadi: " + this.darah + "\n");
    }

    public void isAlive() {
        if (this.darah <= 0) {
            System.out.println("Monster mati, kamu menang!");
            return;
        }
    }

    public void monsterSerangElemen(Characters target) {
        System.out.println("Monster menyerangmu!!");
        System.out.println(this.nama + " menyerang " + target.nama + " dengan elemen " + this.elemen + " sebesar " + this.elemenDamage + " HP!");
        target.menerimaDamage(this.damage);
    }
}

