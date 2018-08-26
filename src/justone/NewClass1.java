/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */
public class NewClass1 {
    public static int[] A = new int[10];
    
    public static void main(String[] args) throws IOException {
    // TODO code application logic here
    String cmd,pilihan ="";
    int pilih ;
    int x;


    System.out.println("-----------------------------MENU PROGRAM-----------------------");
    System.out.println(">> Tekan [1] untuk memasukan 10 bilangan ");
    System.out.println(">> Tekan [2] untuk menampilkan bilangan yang telah dimasukan");
    System.out.println(">> Tekan [3] untuk menampilkan  array bilangan genap & ganjil");
    System.out.println(">> Tekan [4] untuk menampilkan bilangan genap secara descending");
    System.out.println(">> Tekan [5] untuk menampilkan bilangan ganjil secara ascending");
    System.out.println(">> Tekan [6] untuk keluar");
    System.out.println("-----------------------------------------------------------------"); 
         
    do{
        System.out.print("Pilih [1/2/3/4/5/6] ? : ");
        BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));
        pilihan = inputUser.readLine();
        pilih=Integer.parseInt(pilihan);
        System.out.println("-----------------------------------------------------------------");
        
        switch (pilih){
            case 1:
                System.out.println("[1] Masukan 10 bilangan");
                for(int i = 0; i < 10; i++) {
                    try {
                        System.out.print("Bilangan ke - " + (i + 1) + " : ");
                        cmd = inputUser.readLine();
                        x = Integer.parseInt(cmd);
                        A[i] = x;
                    }
                    catch (Exception e ) {
                        System.out.println("anda memasukkan data diluar format");
                    }
                }
                System.out.println("-----------------------------------------------------------------");      
                break;
            
            case 2:
                System.out.println("[2] Bilangan yang telah dimasukan :");
                printA();
                System.out.println("-----------------------------------------------------------------"); 
                break;
            
            case 3:    
                System.out.println("[3] Bilangan Genap dan Ganjil");
                System.out.println("Bilangan Genap : ");
                Genap();
                System.out.println("Bilangan Ganjil :");
                Ganjil();
                System.out.println("-----------------------------------------------------------------");            
                break;
            
            case 4:
                bubbleDesc();
                System.out.println("[4] Bilangan Genap di urutkan secara descending :");
                Genap();
                System.out.println("-----------------------------------------------------------------");
                break;
            
            case 5:     
                bubbleAsc();
                System.out.println("[5] Bilangan Ganjil di urutkan secara ascending :");
                Ganjil();
                System.out.println("-----------------------------------------------------------------");
                break;
            
            case 6:
              
            default :
                 System.out.println("[6] Telah keluar dari program"); 
                 System.exit(0);
            break;
        }
    }
    while(true);
} 

    public static void printA() {
        for(int i = 0; i < 10; i++) {
            System.out.print("\t" + A[i]);
        }
        System.out.println("");
    }

    public static void Ganjil() {
        for(int i = 0; i < 10; i++) {

            if (A[i]%2==1){
            System.out.print("\t" + A[i]);
            }
        }
        System.out.println("");
    }
    
    public static void Genap() {
        for(int i = 0; i < 10; i++) {
            if(A[i] % 2 ==0){
                System.out.print("\t" + A[i]);
            }
        }
        System.out.println("");
    }

    public static void bubbleDesc() {
        for(int i = 1; i < 10; i++) {
            for(int j = i; j < 10; j++) {
                if(A[i - 1] < A[j]) {
                    int Bilarray = A[i - 1];
                    A[i - 1] = A[j];
                    A[j] = Bilarray;
                }
            }
        }
    }
    
    public static void bubbleAsc() {
        for(int i = 1; i < 10; i++) {
            for(int j = i; j < 10; j++) {
                if(A[i - 1] > A[j]) {
                    int Bilarray = A[i - 1];
                    A[i - 1] = A[j];
                    A[j] = Bilarray;
                }
            }
        }
    }
}
