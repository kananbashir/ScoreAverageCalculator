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
public class LeapYear {

    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter year:");
        year = sc.nextInt();
        
        if (year%4!=0 || (year%4==0 && year%100==0 && year%400!=0)){
            System.out.println(year + " is NOT a leap year!");
        } else {
            System.out.println(year + " is a leap year!");
        }
    }
}
