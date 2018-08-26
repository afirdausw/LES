/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justone;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class JustOne {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Masukkan karakter yang ingin diproses = ");
        input = baca.nextLine();
        
        System.out.println("\nKata yang di inputkan adalah '"+input+"'");
        System.out.println("Uppercasenya adalah '"+input.toUpperCase()+"'");
        System.out.println("Lowercasenya adalah '"+input.toLowerCase()+"'");
        System.out.println("Karakter dari '"+input+"' memiliki panjang "+input.length());
    }
    
}
