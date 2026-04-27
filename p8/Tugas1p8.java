package p8;
import java.util.Scanner;
public class Tugas1p8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;

        do{
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();

            System.out.println("Nilai yang diinput: " + nilai);
            System.out.println("Ingin input lagi? (y/t): ");
            pilihan = input.next().charAt(0);

        }while (pilihan == 'y' || pilihan == 'Y');

        System.out.println("Program selesai.");
    }
    
}
