/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan45.cetaknama;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : program mencetak nama
 *
 */
import java.util.Scanner;
public class IF110119023Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Printer p = new Printer();
        Scanner scan = new Scanner(System.in);
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan Nama Anda : ");
        p.setNama(scan.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        p.setJmlCetak(scan.nextInt());
        
        p.cetak(p.getNama());
        p.cetak(p.getNama(), p.getJlmCetak());
    }

}
