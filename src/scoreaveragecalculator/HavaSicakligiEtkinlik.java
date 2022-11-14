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
public class HavaSicakligiEtkinlik {

    public static void main(String[] args) {
        int heat = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz (5-25): ");
        heat = input.nextInt();
        
        if (heat <= 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat <= 15){
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat >= 15 && heat <= 25){
            System.out.println("Piknik yapabilirsiniz.");
        } else if (heat >= 25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
