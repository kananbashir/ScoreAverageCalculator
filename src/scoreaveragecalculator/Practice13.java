package scoreaveragecalculator;

import java.util.Scanner;

public class Practice13 {

    static void addition(double num1, double num2) {
        System.out.println("Result: " + (num1 + num2) + "\n----------------");
    }

    static void subtraction(double num1, double num2) {
        System.out.println("Result: " + (num1 - num2) + "\n----------------");
    }

    static void division(double num1, double num2) {
        System.out.println("Result: " + (num1 * num2) + "\n----------------");
    }

    static void multiplication(double num1, double num2) {
        System.out.println("Result: " + (num1 / num2) + "\n----------------");
    }

    static void pow(double base, double exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        System.out.println("Result: " + result + "\n----------------");
    }

    static void factorial(double num) {
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println("Result: " + result + "\n----------------");
    }

    static void modulo(double num1, double num2) {
        System.out.println("Result: " + (num1 % num2) + "\n----------------");
    }

    static void recAreaCalc(double length, double exponent) {
        System.out.println("Result: " + (length * exponent) + "\n----------------");
    }

    static void recPermCalc(double length, double exponent) {
        System.out.println("Result: " + 2 * (length + exponent) + "\n----------------");
    }

    public static void main(String[] args) {
        int select;
        double num1;
        double num2;

        System.out.println("Welcome to advanced calculator!");

        do {
            System.out.println("\n==================="
                    + "\nPlease choose operation:"
                    + "\n1. Addition"
                    + "\n2. Subtraction"
                    + "\n3. Division"
                    + "\n4. Multiplication"
                    + "\n5. Exponents Calculator"
                    + "\n6. Factorial"
                    + "\n7. Modulo"
                    + "\n8. Rectangle area calculator"
                    + "\n9. Rectangle Perimeter calculation"
                    + "\n10. Log out"
                    + "\n===================");
            Scanner sc = new Scanner(System.in);
            System.out.print("--> ");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.println("\n--- Addition ---\nEnter numbers:");
                    System.out.print("--> ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    addition(num1, num2);
                    break;
                case 2:
                    System.out.println("\n--- Subtraction ---\nEnter numbers:");
                    System.out.print("--> ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    subtraction(num1, num2);
                    break;
                case 3:
                    System.out.println("\n--- Division ---\nEnter numbers:");
                    System.out.print("--> ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    division(num1, num2);
                    break;
                case 4:
                    System.out.println("\n--- Multiplication ---\nEnter numbers:");
                    System.out.print("--> ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    multiplication(num1, num2);
                    break;
                case 5:
                    System.out.println("\n--- Exponents Calculator ---\nEnter base:");
                    System.out.print("--> ");
                    num1 = sc.nextDouble();
                    System.out.println("Enter exponent:");
                    System.out.print("--> ");
                    num2 = sc.nextDouble();
                    pow(num1, num2);
                case 6:
                    System.out.println("\n--- Factorial ---\nEnter number:");
                    System.out.print("--> ");
                    num1 = sc.nextDouble();
                    factorial(num1);
                    break;
                case 7:
                    System.out.println("\n--- Modulo ---\nEnter numbers:");
                    System.out.print("--> ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    modulo(num1, num2);
                    break;
                case 8:
                    System.out.println("\n--- Rectangle Area calculator ---\nEnter length:");
                    System.out.print("--> ");
                    num1 = sc.nextDouble();
                    System.out.println("Enter width:");
                    System.out.print("--> ");
                    num2 = sc.nextDouble();
                    recAreaCalc(num1, num2);
                    break;
                case 9:
                    System.out.println("\n--- Rectangle Perimeter calculator ---\nEnter length:");
                    System.out.print("--> ");
                    num1 = sc.nextDouble();
                    System.out.println("Enter width:");
                    System.out.print("--> ");
                    num2 = sc.nextDouble();
                    recPermCalc(num1, num2);
                    break;
                case 10:
                    System.out.println("\n***Logged out!");
                    break;
                default:
                    System.out.println("\n***Please, enter right operation!");
            }
        } while (select != 10);

    }
}
