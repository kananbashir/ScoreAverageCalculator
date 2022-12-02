package scoreaveragecalculator;

public class Practice14 {
    
    static int pow (int base, int exponent){//2 3
        if (exponent == 0){
            return 1;
        }
        return base * pow (base, exponent-1);
    }
    
    
    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }
}
