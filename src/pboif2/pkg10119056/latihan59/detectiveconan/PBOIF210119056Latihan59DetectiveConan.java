/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan59.detectiveconan;
import java.util.Scanner;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Data Konan
 */
public class PBOIF210119056Latihan59DetectiveConan {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("====Detective Conan====");
        System.out.print("silahkan masukan nama karakter : ");
        Sifat sifat=new Sifat(input.nextLine());
        System.out.println("sifat : "+sifat.karakter());
        
        DetectiveKecil detectiveKecil=new DetectiveKecil(sifat.getNama());
        System.out.println("Tugas : "+detectiveKecil.karakter());
        
    }
    
}
