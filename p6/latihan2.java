package p6;
import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalAir = 0;
        int airPerHari;

        System.out.print("Masukkan pemakaian air per hari (liter): ");
        airPerHari = input.nextInt();

        for(int hari = 1; hari <= 7; hari++) {
            totalAir += airPerHari;
            System.out.println("Hari ke-" + hari + " : " + totalAir + " liter");
        }

        System.out.println("Total pemakaian air selama 7 hari : " + totalAir + " liter");
        input.close();
    }
}
