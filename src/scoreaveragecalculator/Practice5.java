package scoreaveragecalculator;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {
        int num;
        double result = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        num = sc.nextInt();

        for (double i = 1; i <= num; i++){
            result = result + (1/i);
        }
        System.out.println(result);
    }
}
