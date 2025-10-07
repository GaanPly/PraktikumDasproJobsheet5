import java.util.Scanner;

public class ifCetakKRS23 {
    public static void main(String[] args) {
        System.out.println("Cetak KRS");
        System.out.print("Apakah UKT sudah lunas? (True/False) :");
        Scanner input = new Scanner(System.in);
        boolean lunas = input.nextBoolean();
        String status = lunas ? "Lulus" : "Gagal";
        System.out.println(status);
    }
}
