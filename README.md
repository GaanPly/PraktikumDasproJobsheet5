Tugas Jobsheet 4
07 Oktober 2025

Nama	: Putra Bakti Suljati Negara Syamsu
Absen	: 23
Kelas	: TI 1C

Pertanyaan 2.1

1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional?
Jawaban:
Karena variabel yang dipakai sudah merupakan Boolean

2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?
Jawaban:
tidak terjadi apapun

3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi program tersebut dengan menambahkan struktur ELSE!
Jawaban:

<img width="620" height="244" alt="image" src="/FOTO/SS1.png" />


4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 1” 
Jawaban:

<img width="625" height="206" alt="image" src="/FOTO/SS2.png" />


Pertanyaan 2.2
	
1. Apa fungsi dari sintaks break?
Jawaban:
Agar kode tidak terus berlanjut

2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?
Jawaban:
Sama seperti else di if else yaitu di jalankan ketika tidak ada case yang terpilih

3. Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah dibuat ke dalam bentuk IF-ELSE IF-ELSE.

Jawaban:

<img width="625" height="206" alt="image" src="/FOTO/SS3.png" />

4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 2” 

Jawaban:

<img width="625" height="206" alt="image" src="/FOTO/SS2.png" />

Pertanyaan 2.3
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
Mengapa demikian?

Jawaban:
Keluar pesan gagal, mahasiswa masih punya tanggungan kompen

2. Jelaskan maksud dari potongan kode berikut!
    else if (bimbinganP1 < 8 && bimbinganP2 < 4)
Jawaban:
untuk mengecek apakah kedua bimbingan dari pembimbing 1 sudah kurang dari 8 dan pembimbing 2 sudah kurang dari 4

3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara
runtut untuk semua kondisi!

Jawaban: 
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

