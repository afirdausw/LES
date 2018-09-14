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
public class Js2 {
    public static void main(String[] args) {
        
        Scanner baca = new Scanner(System.in);
        int suhu, hasilfahrenheit, hasilreamur;
        double hasilkelvin;
        
        System.out.println("-- Konversi Suhu dari Celcius --");
        System.out.print("Masukkan Suhu Celcius = ");
        suhu = baca.nextInt();
        
   
        Double suhukelvin = Double.valueOf(suhu);
        hasilfahrenheit = (suhu * 9/5) + 32;
        hasilkelvin = suhukelvin + 273.15;
        hasilreamur = suhu * 4/5;
        
        System.out.println("\nHasilnya Adalah :");
        System.out.println("Suhu yang di inputkan = " +suhu+ " Celcius");
        System.out.println(suhu + " Celcius = " + hasilfahrenheit +" Fahrenheit");
        System.out.println(suhu + " Celcius = " + hasilkelvin +" Kelvin");
        System.out.println(suhu + " Celcius = " + hasilreamur +" Reamur");
    }
}
