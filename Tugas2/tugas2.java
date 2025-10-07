import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        angka = input.nextInt();
        if (angka % 2 == 0){
            System.out.println("Genap");
        }
        else {
            System.out.println("Ganjil");
        }
    }
}
