package scoreaveragecalculator;

import java.util.Scanner;

public class Practice6 {

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size:");
        n = sc.nextInt();

        System.out.println("\nResult:\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int a = 0; a < (2 * i) - 1; a++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = n - 1; i != 0; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
