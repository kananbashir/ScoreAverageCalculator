package scoreaveragecalculator;

import java.util.Scanner;

public class Practice16 {

    static void methodByPattern(int n, int side, int temp) {
        if (side == 0 && n > 0 && n <= temp) {
            System.out.print(n + " ");
            n -= 5;
            methodByPattern(n, 0, temp);
            if (n <= 0) {
                methodByPattern(n, 1, temp);
            }
        } else if (side == 1 && n <= temp) {
            System.out.print(n + " ");
            n += 5;
            methodByPattern(n, 1, temp);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        n = sc.nextInt();
        int temp = n;
        System.out.println();
        methodByPattern(n, 0, temp);
    }
}
