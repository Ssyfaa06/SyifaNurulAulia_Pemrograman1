package p4;
import java.util.Scanner;
public class Latihan1 {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        double kehadiran, tugas, uts, uas, total;

        System.out.print("Masukkan Realisasi Kehadiran :");
        kehadiran = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas :");
        tugas = input.nextDouble();
        System.out.print("Masukkan Nilai Uts");
        uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        uas = input.nextDouble();

        total = kehadiran + tugas + uts + uas;
     
        System.out.println("\n=== HASIL NILAI MAHASISWA ===");
        System.out.println("Kehadiran        : " + kehadiran);
        System.out.println("Nilai Tugas      : " + tugas);
        System.out.println("Nilai UTS        : " + uts);
        System.out.println("Nilai UAS        : " + uas);
        System.out.println("Total Nilai      : " + total);
      
        input.close();
    }
}
