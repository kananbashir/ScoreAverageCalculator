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
public class Practice8 {

    public static void main(String[] args) {
        int num;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number: ");
        num = sc.nextInt();

        for (int a = num - 1; a != 0; a--) {
            if (num % a == 0) {
                sum = a + sum;
            }
        }

        if (sum == num) {
            System.out.println("\n" + num + " is Perfect Number.");
        } else {
            System.out.println("\n" + num + " is not Perfect Number.");
        }
    }
}
