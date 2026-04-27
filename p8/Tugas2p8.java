package p8;
import java.util.Scanner;

public class Tugas2p8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char pilihan;
        int total = 0;

    do{
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        total+= nilai;
        
        System.out.print("Tambah nilai lagi? (y/t): ");
        pilihan = input.next().charAt(0);

    }while (pilihan == 'y' || pilihan == 'Y');
    System.out.println("Total nilai: " + total);
    }
}
