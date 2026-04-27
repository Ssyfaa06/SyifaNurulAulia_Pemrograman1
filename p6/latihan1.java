package p6;
import java.util.Scanner;

public class latihan1 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalPengunjung = 0;
        int pengunjungPerHari;

        System.out.print("Masukkan jumlah pengunjung per hari: ");
        pengunjungPerHari = input.nextInt();

        for(int hari = 1; hari <= 7; hari++) {
            totalPengunjung += pengunjungPerHari;
            System.out.println("Hari ke-" + hari + " : " + totalPengunjung + " orang");
        }

        System.out.println("Total pengunjung selama 7 hari : " + totalPengunjung + " orang");
        input.close();
    }
}

