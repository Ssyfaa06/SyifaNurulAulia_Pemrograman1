package p5;

import java.util.Scanner;
public class latihan {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();
        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan bilangan ke-" + (i+1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\nHasil:");
        for (int i = 0; i < n; i++) {
            if (angka[i] % 2 == 0) {
                System.out.println("Angka " + angka[i] + " adalah Bilangan Genap");
            } else {
                System.out.println("Angka " + angka[i] + " adalah Bilangan Ganjil");
            }
        }

        input.close();
    }
}

