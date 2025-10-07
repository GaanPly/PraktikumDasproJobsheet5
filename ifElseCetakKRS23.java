import java.util.Scanner;

public class ifElseCetakKRS23 {
    public static void main(String[] args) {
        System.out.println("Cetak KRS");
        System.out.print("Apakah UKT sudah lunas? (True/False) :");
        Scanner input = new Scanner(System.in);
        int semester = input.nextInt();
        if (semester == 1){
            System.out.println("Menampilkan SMT 1");
        }
        else if (semester == 2){
            System.out.println("Menampilkan SMT 2");
        }
        else if (semester == 3){
            System.out.println("Menampilkan SMT 3");
        }
        else if (semester == 4){
            System.out.println("Menampilkan SMT 4");
        }
        else if (semester == 5){
            System.out.println("Menampilkan SMT 5");
        }
        else if (semester == 6){
            System.out.println("Menampilkan SMT 6");
        }
        else if (semester == 7){
            System.out.println("Menampilkan SMT 7");
        }
        else if (semester == 8){
            System.out.println("Menampilkan SMT 8");
        }
        else {
            System.out.println("INPUT SEMESTER YG BENER DIKIT NAPA??? ANTARA 1-8 DOANG WOI");
        }
    }
}
