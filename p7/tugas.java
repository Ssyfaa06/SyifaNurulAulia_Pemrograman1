package p7;

import java.util.Scanner;

public class tugas {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPertemuan, hadir;
        double tugas, uts, uas, nilaiAkhir;
        char grade;

        // Input kehadiran
        System.out.print("Masukkan total pertemuan: ");
        totalPertemuan = input.nextInt();

        System.out.print("Masukkan jumlah kehadiran: ");
        hadir = input.nextInt();

        double batasKehadiran = 0.75 * totalPertemuan;

        // Cek kehadiran
        if (hadir >= batasKehadiran) {

            // Input nilai
            System.out.print("Masukkan nilai tugas: ");
            tugas = input.nextDouble();

            System.out.print("Masukkan nilai UTS: ");
            uts = input.nextDouble();

            System.out.print("Masukkan nilai UAS: ");
            uas = input.nextDouble();

            // Hitung nilai akhir
            nilaiAkhir = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);

            // Penentuan grade
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

            // Output
            System.out.println("\nNilai Akhir: " + nilaiAkhir);
            System.out.println("Grade: " + grade);

        } else {
            System.out.println("\nKehadiran tidak memenuhi syarat (kurang dari 75%)");
        }

        input.close();
    }
}
