package p5;

import java.util.Scanner;
public class latihan2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah nama: ");
        int n = input.nextInt();
        input.nextLine(); 
        String[] nama = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama ke-" + (i+1) + ": ");
            nama[i] = input.nextLine();
        }
        System.out.println("\nDaftar Nama:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nama ke-" + (i+1) + ": " + nama[i]);
        }
        input.close();
    }
}

