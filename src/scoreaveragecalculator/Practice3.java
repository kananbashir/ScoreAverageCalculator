/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreaveragecalculator;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        int numLimit;

        System.out.println("Please enter limiting number:");
        Scanner sc = new Scanner(System.in);
        numLimit = sc.nextInt();

        int i = 1;
        int a = 1;

        System.out.println("\nResult:");
        while (i < numLimit || a < numLimit) {
            if (i < numLimit) {
                System.out.println(i);
            }
            if (a < numLimit) {
                System.out.println(a);
            }
            i = i * 4;
            a = a * 5;
        }
    }
}
