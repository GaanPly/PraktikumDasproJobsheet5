import java.util.Scanner;

public class nestedUjianSkripsi23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pesan;

        // Langkah 5: Menerima masukan bebasKompen
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = input.next().trim(); // .trim() digunakan untuk menghapus spasi sebelum dan sesudah

        // Langkah 6: Menerima masukan log bimbingan P1 dan P2
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = input.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = input.nextInt();

        // Langkah 7: Buatlah struktur pemilihan Nested-IF
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                // Semua syarat terpenuhi: Bebas kompen = "Ya", P1 >= 8, P2 >= 4
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                // P1 dan P2 kurang dari syarat
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                // Hanya P1 yang kurang dari syarat
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else { // ini mencakup kondisi bimbinganP1 >= 8 TAPI bimbinganP2 < 4
                // Hanya P2 yang kurang dari syarat
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else { // bebasKompen TIDAK sama dengan "Ya"
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }

        // Tutup scanner
        input.close();

        // Langkah 8 (bagian output): Compile dan run program sehingga menghasilkan tampilan
        System.out.println("\nOutput:"); // Menambahkan baris kosong untuk pemisah
        System.out.println(pesan);
    }
}
