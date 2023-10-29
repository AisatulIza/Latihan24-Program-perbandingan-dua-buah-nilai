package pkgLatihan24;
import java.util.Scanner;
/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Deskripsi : Program ini adalah program yang menampilkan Perbandingan dua buah nilai 
*/
public class SIRegPagi22166008Latihan24 {
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
    String ulangi = "Ya";
    //Perulangan while
    while (ulangi.equalsIgnoreCase("Ya")) {
        System.out.println("=====Program Perbandingan Nilai=====");
        System.out.print("Masukkan nilai pertama : ");
        int n_1 = scanner.nextInt();
        System.out.print("Masukkan nilai ke dua : "); 
        int n_2 = scanner.nextInt();
        //pernyataan if else 3 kondisi
        if (n_1 > n_2) { 
            System.out.println("Hasil : " +n_1+ " lebih besar dari " + n_2);
        } else if (n_1 < n_2) {
            System.out.println("Hasil : " +n_1+ " lebih kecil dari " + n_2);
        } else {
            System.out.println("Hasil : " +n_1+ " sama dengan " + n_2);
        }
        //Mengulang aktifitas
        System.out.print("Ulangi aktifitas? (Ya/Tidak) : ");
        ulangi = scanner.next();
    }
  }
}
