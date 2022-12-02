package scoreaveragecalculator;

public class Practice11 {

    public static void main(String[] args) {
        int num = 1551;
        int temp = num;
        int lastNum;
        int reversedNum = 0;
        
        while (temp != 0) {
            lastNum = temp % 10;//1
            reversedNum = (reversedNum * 10) + lastNum;
            temp /= 10;
        }
        
        System.out.println(reversedNum);
        

    }
}
