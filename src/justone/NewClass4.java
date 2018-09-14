/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package justone;

/**
 *
 * @author Firdaus
 */
import java.util.Arrays;
import java.util.Random;

public class NewClass4 {
    private static int[] anArray;

    public static void main(String args[]) {
        anArray = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            anArray[i] = rand.nextInt(201);
        }
        System.out.println(Arrays.toString(anArray));
    }
}
