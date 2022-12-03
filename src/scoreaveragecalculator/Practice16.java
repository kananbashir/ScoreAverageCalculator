package scoreaveragecalculator;

import java.util.Scanner;

public class Practice16 {

    static void methodByPattern(int n, boolean side, int temp) {
        if (side && n > 0 && n <= temp) {
            System.out.print(n + " ");
            n -= 5;
            methodByPattern(n, true, temp);
            if (n <= 0) {
                methodByPattern(n, false, temp);
            }
        } else if (side == false && n <= temp) {
            System.out.print(n + " ");
            n += 5;
            methodByPattern(n, false, temp);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        n = sc.nextInt();
        int temp = n;
        System.out.println();
        methodByPattern(n, true, temp);
    }
}
