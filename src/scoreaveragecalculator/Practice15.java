package scoreaveragecalculator;
import java.util.Scanner;

public class Practice15 {

    static boolean isPrime(int num, int temp) {
        if (num == 1) {
            return false;
        }
        if (temp % --num != 0) {
            return isPrime(num, temp);
        } else if (temp % num == 0 && num != 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter positive number:");
        num = sc.nextInt();
        int temp = num;

        if (isPrime(num, temp)) {
            System.out.println("\n" + num + " is a prime number!");
        } else {
            System.out.println("\n" + num + " is NOT a prime number!");
        }

    }
}
