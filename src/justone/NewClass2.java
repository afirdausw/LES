/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justone;

import java.util.Locale;

/**
 *s
 * @author Lenovo
 */
public class NewClass2 {
    public static void main(String[] args) {
        String[][] mobil = {  
                            {"Toyota", "Jepang", "2010"},
                            {"Nissan", "Jepang", "2009"},
                            {"Ferrari", "Germany", "2013"},
                            {"Lamborghini", "Italy", "2012"}
                           };
        
        System.out.println(mobil[0][0]+", "+mobil[2][1]+", "+mobil[2][2]);
        
        
        System.out.println("2012-02-12");
        System.out.printf("My name is: %s%n", "joe");
    }
}
