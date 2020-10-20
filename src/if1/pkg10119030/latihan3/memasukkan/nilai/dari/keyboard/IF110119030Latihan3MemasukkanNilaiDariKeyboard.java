package if1.pkg10119030.latihan3.memasukkan.nilai.dari.keyboard;
import java.util.Scanner;
/**
 * Nama     : Rendy Dermawan
 * Kelas    : IF-1
 * NIM      : 10119030
 * Deskripsi Program : Program Latihan Input Nilai
 */
public class IF110119030Latihan3MemasukkanNilaiDariKeyboard {
    public static void main(String[] args) {
    
            System.out.print("Masukkan Nama Anda : ");
            Scanner scanner = new Scanner(System.in);
            
            String nama = scanner.next();
            System.out.println("Nama anda adalah " + nama);
    } 
}
