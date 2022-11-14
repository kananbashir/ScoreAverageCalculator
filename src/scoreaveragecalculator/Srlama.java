
package scoreaveragecalculator;

import java.util.Scanner;

public class Srlama {
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("a:");
        a = sc.nextInt();
        
        System.out.println("b:");
        b = sc.nextInt();
        
        System.out.println("c:");
        c = sc.nextInt();
        
        if ((a > b) && (a > c)){
            if (b > c){
                System.out.println(a+" "+b+" "+c);
                System.out.println("a > b > c");
            } else {
                System.out.println(a+" "+c+" "+b);
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)){
            if (a > c){
                System.out.println(b+" "+a+" "+c);
                System.out.println("b > a > c");
            } else {
                System.out.println(b+" "+c+" "+a);
                System.out.println("b > c > a");
            }
        } else {
            if (a > b){
                System.out.println(c+" "+a+" "+b);
                System.out.println("c > a > b");
            } else {
                System.out.println(c+" "+b+" "+a);
                System.out.println("c > b > a");
            }
        }
    }
}
