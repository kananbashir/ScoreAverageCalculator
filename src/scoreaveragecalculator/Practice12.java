package scoreaveragecalculator;

public class Practice12 {

    static int fib(int n) {//6
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(9));
    }
}