import java.util.Scanner;

/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program : Memberikan hasil test kepribadian berdasarkan warna yang
 * telah diinput oleh user dengan menggunakan konsep OOP
 *
 */
public class main {

    public static void main(String[] args) {
        Warna wrn = new Warna();
        User usr = new User();
        Scanner scn = new Scanner(System.in);

        wrn.menampilkanTemplate();
        wrn.pilihWarnaFavorit();
        usr.memasukkanNama();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "+ usr.namaUser.toUpperCase()+"====");
        wrn.tesKepribadian(wrn.namaWarna,usr.namaUser);


    }
}
