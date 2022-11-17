/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreaveragecalculator;

import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {
        int baseNum, expNum, total = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number:");
        baseNum = sc.nextInt();//3

        System.out.println("Enter exponent number:");
        expNum = sc.nextInt();//4

        for (int i = 1; i <= expNum; i++) {
            total = total * baseNum;
        }
        
        System.out.println("\nResult: " + total);

    }
}
