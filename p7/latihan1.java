package p7;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tugas, uts, uas, nilaiAkhir;
        char grade;

        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextDouble();

        nilaiAkhir = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);

        if (nilaiAkhir >= 80) {
            grade = 'A';
        } else if (nilaiAkhir >= 70) {
            grade = 'B';
        } else if (nilaiAkhir >= 60) {
            grade = 'C';
        } else if (nilaiAkhir >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("\nNilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);

        input.close();
    }
}

