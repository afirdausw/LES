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
public class Js1 {
    public static void main(String args[]) {
        System.out.println("-- Menghitung Luas Permukaan Bola --");
        System.out.print("Masukkan jari-jari bola : ");
        Scanner baca = new Scanner(System.in); 
        double jari = baca.nextDouble();
        System.out.println("Luas permukaan Bola = " + jari * jari * 22/7 * 4);
    }
}
