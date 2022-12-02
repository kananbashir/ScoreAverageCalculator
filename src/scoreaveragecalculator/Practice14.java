package scoreaveragecalculator;

import java.util.Scanner;

public class Practice14 {

    static int pow(int base, int exponent) {//2 3
        if (exponent == 0) {
            return 1;
        }
        return base * pow(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        
        System.out.println(pow(base, exponent));
        
    }
}
