/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justone;

import java.util.Scanner;

/**
 *
 * @author Firdaus
 */
public class Js3 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        String nm, ns, tl, tg, jk, al, mo;
        
        System.out.print("Masukkan NAMA = ");
        nm = baca.nextLine();
        System.out.print("Masukkan NIS = ");
        ns = baca.nextLine();
        System.out.print("Masukkan TEMPAT LAHIR = ");
        tl = baca.nextLine();
        System.out.print("Masukkan TANGGAL LAHIR = ");
        tg = baca.nextLine();
        System.out.print("Masukkan JENIS KELAMIN = ");
        jk = baca.nextLine();
        System.out.print("Masukkan ALAMAT DI MALANG = ");
        al = baca.nextLine();
        System.out.print("Masukkan MOTTO HIDUP = ");
        mo = baca.nextLine();
        
        System.out.println(" ---- ");
        System.out.println("Nama            : " + nm);
        System.out.println("NIS             : " + ns);
        System.out.println("Tempat Lahir    : " + tl);
        System.out.println("Tanggal Lahir   : " + tg);
        System.out.println("Jenis Kelamin   : " + jk);
        System.out.println("Alamat di Malang: " + al);
        System.out.println("Motto Hidup     : " + mo);
    }
}
