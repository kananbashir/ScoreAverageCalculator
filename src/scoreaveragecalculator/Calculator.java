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
public class Calculator {

    public static void main(String[] args) {
        int value1, value2, operation = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first value: ");
        value1 = sc.nextInt();
        System.out.println("Input second value: ");
        value2 = sc.nextInt();

        System.out.println("Please, select operation:");
        System.out.println("Addition (1)\nSubtraction (2)\nMultiplication (3)\nDivision (4)");
        operation = sc.nextInt();     
                
        switch (operation) {
            case 1:
                System.out.println("Result: " + (double)(value1 + value2));
                break;
            case 2:
                System.out.println("Result: " + (double)(value1 - value2));
                break;
            case 3:
                System.out.println("Result: " + (double)(value1 * value2));
                break;
            case 4:
                System.out.println("Result: " + (double)(value1 / value2));
                break;
            default:
                System.out.println("Wrong selection!");
        }
    }
}
