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
public class NewClass {
    public static int[] A = new int[6];
    
    public static void main(String[] args) {
        String input, pilihan = "";
        int pilih ;
        int x;
        Scanner baca = new Scanner(System.in);
      
        for(int i = 0; i<6; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + " : ");
            input = baca.nextLine();
            x = Integer.parseInt(input);
            A[i] = x;
        }
        
        Genap();
        Ganjil();
    }
    
    public static void Ganjil() {
        System.out.println("Bilangan Ganjil :");
        for(int i = 0; i < 6; i++) {

            if (A[i]%2==1){
            System.out.print("\t" + A[i]);
            }
        }
        System.out.println("");
    }
    
    public static void Genap() {
        System.out.println("Bilangan Genap : ");
        for(int i = 0; i < 6; i++) {
            if(A[i] % 2 ==0){
                System.out.print("\t" + A[i]);
            }
        }
        System.out.println("");
    }
}
