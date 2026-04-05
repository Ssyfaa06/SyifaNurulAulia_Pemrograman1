package p4;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        double gajipokok, bonus, total;
        System.out.print("Gaji pokok :");

        while (!input.hasNextDouble()) {
            System.out.print("Masukkan angka saja: ");
            input.next();
        }
        gajipokok = input.nextDouble();

        bonus = gajipokok *0.5;
        total = gajipokok + bonus;

        System.out.println("\n===== HASIL GAJI =====");
        System.out.println("Gaji Pokok  : " + gajipokok);
        System.out.println("Bonus       : " + bonus);
        System.out.println("Total Gaji  : " + total);

        input.close();
        
    }
}
