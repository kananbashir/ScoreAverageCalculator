/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreaveragecalculator;

import java.util.Scanner;

public class SinifiGecme {

    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        matematik = input.nextInt();

        System.out.println("Fizik notunuz:");
        fizik = input.nextInt();

        System.out.println("Türkçe notunuz:");
        turkce = input.nextInt();

        System.out.println("Kimya notunuz:");
        kimya = input.nextInt();

        System.out.println("Müzik notunuz:");
        muzik = input.nextInt();

        average = ((matematik + fizik + turkce + kimya + muzik) / 2);

        if (average > 55 && average > 0) {
            System.out.println("\nSınav ortalaması: " + average);
            System.out.println("\nSınavı başarıyla gectiniz!");
        } else if (average < 55 && average > 0) {
            System.out.println("\nSınav ortalaması: " + average);
            System.out.println("\nSınavı geçemediniz!");
        } else if (average < 0 || average == 0) {
            System.out.println("\nSınav ortalaması: " + average);
            System.out.println("\nOrtalamaya katılamadınız!");
        }
    }
}
