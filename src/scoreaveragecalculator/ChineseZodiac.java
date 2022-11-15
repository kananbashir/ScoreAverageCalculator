/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreaveragecalculator;

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {
        int birthYear, zodiacMod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your birthday year:");
        birthYear = sc.nextInt();
        while (birthYear < 1900 || birthYear > 2022) {
            System.out.println("\n**Wrong Input**"
                    + "\nEnter again!");
            birthYear = sc.nextInt();
        }
        zodiacMod = birthYear % 12;

        switch (zodiacMod) {
            case 0:
                System.out.println("Your Chinese Zodiac sign is - Monkey");
                break;
            case 1:
                System.out.println("Your Chinese Zodiac sign is - Rooster");
                break;
            case 2:
                System.out.println("Your Chinese Zodiac sign is - Dog");
                break;
            case 3:
                System.out.println("Your Chinese Zodiac sign is - Pig");
                break;
            case 4:
                System.out.println("Your Chinese Zodiac sign is - Rat");
                break;
            case 5:
                System.out.println("Your Chinese Zodiac sign is - Ox");
                break;
            case 6:
                System.out.println("Your Chinese Zodiac sign is - Tiger");
                break;
            case 7:
                System.out.println("Your Chinese Zodiac sign is - Rabbit");
                break;
            case 8:
                System.out.println("Your Chinese Zodiac sign is - Dragon");
                break;
            case 9:
                System.out.println("Your Chinese Zodiac sign is - Snake");
                break;
            case 10:
                System.out.println("Your Chinese Zodiac sign is - Horse");
                break;
            case 11:
                System.out.println("Your Chinese Zodiac sign is - Sheep");
                break;
        }

    }
}
