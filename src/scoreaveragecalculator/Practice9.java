/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreaveragecalculator;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Practice9 {
    public static void main(String[] args) {
        /*
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *  
        */
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Basamak sayısı: ");
        n = sc.nextInt();   
        
        System.out.println("\n");
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < (n-1) - ((n-1)-i); j++){
                System.out.print(" ");
            }
            for (int k = 0; k < n+(n-1) - (i*2); k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        
        
        
        
    }
}
