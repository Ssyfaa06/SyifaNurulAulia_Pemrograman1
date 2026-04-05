package p2;
import java.util.Scanner;
public class L1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input nama: ");
        String nama = input.nextLine();

        int usia;
        System.out.print("Input usia: ");
        while (!input.hasNextInt()) {
            System.out.print("Masukkan angka usia: ");
            input.next();
        }
        usia = input.nextInt();

        System.out.println("\n=== HASIL ===");
        System.out.println("Syifa nurul aulia: " + nama);
        System.out.println("19th: " + usia + " tahun");

        input.close();
    }
}