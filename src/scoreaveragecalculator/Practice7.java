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
public class Practice7 {

    public static void main(String[] args) {
        int num;
        int length;
        int max = 0;
        

        System.out.println("How many numbers you want to add?:");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        int[] arr = new int[length];

        System.out.println("\nPlease enter " + length + " numbers:");
        for (int i = 0; i < length; i++) {
            System.out.print((i+1)+". ");
            num = sc.nextInt();
            arr[i] = num;
        }

        for (int a = 0; a < length; a++) {
            if (arr[a] > max) {
                max = arr[a];
            }
        }

        int min = arr [0];
        
        for (int b = 0; b < length; b++) {
            if (arr[b] < min) {
                min = arr[b];
            }
        }

        System.out.println("\nNumber list - " + Arrays.toString(arr));
        System.out.println("Max. value - " + max);
        System.out.println("Min. value - " + min);
    }
}
