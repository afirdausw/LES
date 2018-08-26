/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justone;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Lenovo
 */
public class NewClass3 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }
        
        System.out.println("----");
        
        int b = 1;
        do{
            System.out.println(b);
            b++;
        }while(b <= 5);
        
        System.out.println("----");
        
        for (int a=1; a<=5; a++){
            System.out.println(a);
        }
        
        System.out.println("----");
        
        for(int n = 1; n <= 30; n += 2){
            System.out.print(n + ", ");
        }
        
        System.out.println("");
        System.out.println("----");
        
        String s = " geeks for geeks has all java functions to read  "; 
        System.out.println(s.trim());  

        s = " Chetna loves reading books"; 
        System.out.println(s.trim());
        
        System.out.println(s.replace(" ", ""));
        
        System.out.println(s.length());
        
        System.out.println(s.substring(8, 21));
        
        String key = "Saya";
        System.out.println(key.isEmpty());
        System.out.println(key.equals("saya")); // Mengembalikan nilai boolean true false
        System.out.println(key.equalsIgnoreCase("saya")); // Mengembalikan nilai boolean true false
        System.out.println(key.compareTo("DIA")); // Mengembalikan nilai berupa angka integer
        System.out.println(key.compareToIgnoreCase("dia")); // Mengembalikan nilai berupa angka integer
        System.out.println(key.contains("y"));
        System.out.println(key.toUpperCase());
        System.out.println(key.toLowerCase());
        System.out.println(key.concat(" Belajar Java"));
        
        String besar = s.toUpperCase();
        String[] kata = besar.split(" ");
        for(String k : kata){
            System.out.println(k);
        }
        
        System.out.printf("%s\n%s\n", "Selamat Datang", "Di pembelajaran JAVA");
        
        double piVal = Math.PI;
        System.out.format("%f\n", piVal);
        
        double harga = 250000000;
        NumberFormat kurensiEropa = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.printf("Harga Pound: %s %n", kurensiEropa.format(harga));

        NumberFormat kurensiJepang = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.printf("Harga Yen: %s %n", kurensiJepang.format(harga));

        NumberFormat kurensiUS = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.printf("Harga Dolar: %s %n", kurensiUS.format(harga));

        NumberFormat kurensiPrancis = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.printf("Harga Euro: %s %n", kurensiPrancis.format(harga));

        NumberFormat kurensiKorea = NumberFormat.getCurrencyInstance(Locale.KOREA);
        System.out.printf("Harga Won: %s %n", kurensiKorea.format(harga));

        System.out.printf("%.2f", harga);
        System.out.println("\n");
        System.out.printf("%s%n", NumberFormat.getCurrencyInstance(Locale.ITALY).format(harga));
    }
}
