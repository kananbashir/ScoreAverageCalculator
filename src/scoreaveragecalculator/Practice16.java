package scoreaveragecalculator;

import java.util.Scanner;

public class Practice16 {

    static void methodByPattern(int n, int side, int temp) {
        if (side == 1 && n > 0 && n <= temp) {
            System.out.print(n + " ");
            n -= 5;
            methodByPattern(n, 1, temp);
            if (n <= 0) {
                methodByPattern(n, 2, temp);
            }
        } else if (side == 2 && n <= temp) {
            System.out.print(n + " ");
            n += 5;
            methodByPattern(n, 2, temp);
        }
    }

    public static void main(String[] args) {
        int n;
        int side = 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        n = sc.nextInt();
        int temp = n;
        System.out.println();
        methodByPattern(n, side, temp);
    }
}
