/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primermassiv;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class PrimerMassiv {


    public static void main(String[] args) {
           int[] numbers = new int[10];
           Random rnd = new Random();
           for(int i = 0; i < numbers.length; i++){
               numbers[i] = rnd.nextInt(100);
               System.out.printf("%5d", numbers[i]);
           }
           System.out.println("");
           int max = numbers[1];
           for (int i = 1; i < numbers.length; i++){
               if (numbers[i] > max){
                   max = numbers[i];
               }
           }
           System.out.println("Max number is " + max);
           System.out.println("Использование метода копирования ");
           int[] newnumbers1 = new int[numbers.length];
           System.arraycopy(numbers, 0, newnumbers1, 0, numbers.length);
           int[] newnumbers = new int[10];
           Random rnd1 = new Random();
           for(int i = 0; i < numbers.length; i++){
               numbers[i] = rnd.nextInt(100);
               System.out.printf("%5d", numbers[i]);
           }
           System.out.println("");
           int max1 = numbers[1];
           for (int i = 1; i < numbers.length; i++){
               if (numbers[i] > max){
                   max = numbers[i];
            System.out.println("Max number is " + max);
           
    }
    
}
    }
    }
