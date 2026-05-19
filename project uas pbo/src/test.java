import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Random rand = new Random();
        Hero player = new Hero("player", 100, 20, 33);
        Monster zeus = new Monster("monster", 85, 18, "Mani", 26);
        Scanner scan = new Scanner(System.in);

        System.out.println("demo rpg");
        int pilihan;
        while (true) {
            int angkaAcak = rand.nextInt(3);
            System.out.println("\n=== Menu Program ===");
            System.out.println("1. Heal");
            System.out.println("2. menyerang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            if (pilihan == 0) {
                System.out.println("Program berhenti. Terima kasih!");
                return;
            } else if (pilihan == 1) {
                player.heal();
            } else if (pilihan == 2) {
                player.Serang(zeus);
            } else {
                System.out.println("pilih yang benar!!");
            }
            if (angkaAcak == 0) {
                zeus.monsterSerang(player);
            } else if (angkaAcak == 1) {
                zeus.heal();
            } else {
                zeus.monsterSerangElemen(player);
            }


            if (player.darah > 0) {
                System.out.println("Player darah: " + player.darah);
            } else {
                System.out.println("Player Status: mati");
                return;
            }
            player.isAlive();
            zeus.isAlive();
            if (zeus.darah > 0) {
                System.out.println("Monster darah: " + zeus.darah);
            } else {
                System.out.println("Monster Status: Mati");
                return;
            }


        }
    }

}
