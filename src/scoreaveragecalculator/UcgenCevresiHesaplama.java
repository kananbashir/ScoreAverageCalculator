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
public class UcgenCevresiHesaplama {

    public static void main(String[] args) {
        int a, b, c;
        double u, cevreUzunlugu, alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Input value for a, b and c:");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        u = (a + b + c) / 2;
        cevreUzunlugu = u * u;
        alan = u * (u - a) * (u - b) * (u - c);
        
        System.out.println("Alan: "+alan);

    }
}
