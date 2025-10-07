import java.util.Scanner;

public class ifCetakKRS23 {
    public static void main(String[] args) {
        System.out.println("Cetak KRS");
        System.out.print("Apakah UKT sudah lunas? (True/False) :");
        Scanner input = new Scanner(System.in);
        boolean lunas = input.nextBoolean();
        if (lunas){
            System.out.println("UKT Terverifikasi");
            System.out.println("Silahkan Cetak Dan Minta Tanda Tangan DPA");
        }
        else {
            System.out.println("Tolong bayar UKT");
        }
    }
}
