/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreaveragecalculator;

import java.util.Scanner;

public class KDVHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value:");
        double tutar = input.nextDouble();
        double kdvOran = tutar <= 1000 ? 0.18 : 0.08;
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV-siz tutar: " + tutar);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDV-li tutar: " + kdvliTutar);

    }
}
