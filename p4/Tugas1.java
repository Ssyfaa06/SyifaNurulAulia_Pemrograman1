package p4;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double makan, transport, belanja, total;
        double persenMakan, persenTransport, persenBelanja;

        System.out.print("Masukkan biaya makan: ");
        makan = input.nextDouble();

        System.out.print("Masukkan biaya transport : ");
        transport = input.nextDouble();

        System.out.print("Masukkan biaya belanja : ");
        belanja = input.nextDouble();

        total = makan + transport + belanja;
        persenMakan = (makan / total) * 100;
        persenTransport = (transport / total) * 100;
        persenBelanja = (belanja / total) * 100;

         System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total = " + total);

        System.out.println("\n=== PERSENTASE ===");
        System.out.println("Makan     = " + persenMakan + "%");
        System.out.println("Transport = " + persenTransport + "%");
        System.out.println("Belanja   = " + persenBelanja + "%");

        input.close();
    }
}
