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
public class Practice2 {

    public static void main(String[] args) {
        int num, sum = 0;
        System.out.println("Please input numbers (till odd number):");
        Scanner sc = new Scanner(System.in);
        do {
            num = sc.nextInt();
            if (num % 2 == 0 && num % 4 == 0) {
                sum = sum + num;
            }
        } while (num % 2 == 0);

        System.out.println("Total sum of even and multiple of 4 number: " + sum);
    }
}
