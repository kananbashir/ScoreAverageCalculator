package scoreaveragecalculator;

import java.util.Scanner;

public class ATMProject {

    public static void main(String[] args) {
        String username = "", password = "";
        int right = 3;
        int select;
        int amount;
        int balance = 2458;
        System.out.println("Welcome to ATM machine :D");

        while (right > 0) {

            System.out.println("Please enter username and password to login:");
            Scanner sc = new Scanner(System.in);
            System.out.println("Username:");
            System.out.print("-> ");
            username = sc.nextLine();
            System.out.println("Password:");
            System.out.print("-> ");
            password = sc.nextLine();
            if (username.equals("k") && password.equals("k")) {
                System.out.println("Successfully entered!");

                do {
                    System.out.println("\n-------------------------"
                            + "\nPlease select operation:"
                            + "\n1. Cash in"
                            + "\n2. Cash out"
                            + "\n3. Balance inquiry"
                            + "\n4. Log out"
                            + "\n-------------------------");
                    System.out.print("-> ");
                    select = sc.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("\nPlease enter amount to cash in:");
                            System.out.print("-> ");
                            amount = sc.nextInt();
                            balance += amount;
                            System.out.println(amount + " USD successfully added to account!");
                            break;
                        case 2:
                            System.out.println("\nPlease enter amount to cash out:");
                            System.out.print("-> ");
                            amount = sc.nextInt();
                            if (amount > balance) {
                                System.out.println("***Exceeded amount! (balance: " + balance + " USD)");
                            } else {
                                balance -= amount;
                                System.out.println(amount + " USD cashed out successfully!");
                            }
                            break;
                        case 3:
                            System.out.println("\nYour account balance is -- " + balance + " USD.");
                    }
                } while (select != 4);
                System.out.println("\nGood bye!");
                break;
            } else {
                System.out.println("\n***Username or password is wrong!\n");
                right--;
                if (right == 0) {
                    System.out.println("***Your account blocked. Please contact your bank!");
                } else {
                    System.out.println("You have " + right + " attempts left.\nPlease try again!\n\n");
                }
            }
        }
    }
}
