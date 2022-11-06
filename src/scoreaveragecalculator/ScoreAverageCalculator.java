
package scoreaveragecalculator;

import java.util.Scanner;

public class ScoreAverageCalculator {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Math score: ");
        mat = input.nextInt();

        System.out.println("Input Physics score: ");
        fizik = input.nextInt();

        System.out.println("Input Chemistry score: ");
        kimya = input.nextInt();

        System.out.println("Input Turkish score: ");
        turkce = input.nextInt();

        System.out.println("Input History score: ");
        tarih = input.nextInt();

        System.out.println("Input Music score: ");
        muzik = input.nextInt();

        int total = mat + fizik + kimya + turkce + tarih + muzik;
        double average = total / 6;

        System.out.print("Average score is: " + average);
        String str = (average > 60) ? "\nSınıfı geçti" : "\nSınıfta kaldı";
        System.out.println(str);
    }    
}
