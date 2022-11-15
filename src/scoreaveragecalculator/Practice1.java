/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreaveragecalculator;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        int num, count = 0, result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                result = result + i;
                count++;
            }
        }

        System.out.println("Average: " + result / count);

    }
}
