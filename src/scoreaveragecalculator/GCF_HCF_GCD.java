/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreaveragecalculator;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class GCF_HCF_GCD {

    public static void main(String[] args) {
        int num;
        int num2;
        int smallestNum;
        int gcf = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 1st number: ");
        num = sc.nextInt();
        System.out.print("Please enter 2nd number: ");
        num2 = sc.nextInt();
        
        if (num < num2){
            smallestNum = num;
        } else {
            smallestNum = num2;
        }
        
        for (int i = 1; i <= smallestNum; i++){
            if (num % i == 0 && num2 % i == 0){
                gcf = i;
            }
        }
        
        System.out.println(gcf);


    }
}
