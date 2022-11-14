
package scoreaveragecalculator;
import java.util.Scanner;

public class UcakBileti {

    public static void main(String[] args) {
        int tripRange, age, tripType;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input trip range (KM)");
        tripRange = sc.nextInt();
        tripRange *= 0.1;
        while (tripRange < 0) {
            System.out.println("**Wrong input!**"
                    + "\nTry again:");
            tripRange = sc.nextInt();
            tripRange *= 0.1;
        }

        System.out.println("\nInput your age: ");
        age = sc.nextInt();
        while (age < 1) {
            System.out.println("**Wrong input!**"
                    + "\nTry again:");
            age = sc.nextInt();
        }
        
        
        if (age <= 12) {
            tripRange = (int) (tripRange - (tripRange * 0.5));
        } else if (age >= 12 && age <= 24) {
            tripRange = (int) (tripRange - (tripRange * 0.1));
        } else if (age > 65) {
            tripRange = (int) (tripRange - (tripRange * 0.3));
        }

        System.out.println("\nInput trip type:"
                + "\n---> (1) One direction"
                + "\n---> (2) Round trip");
        tripType = sc.nextInt();
        while (tripType != 1 && tripType != 2) {
            System.out.println("**Wrong input!**"
                    + "\nTry again:");
            tripType = sc.nextInt();
        }

        switch (tripType) {
            case 1:
                System.out.println("\nTotal price: " + tripRange + " TL");
                break;
            case 2:
                tripRange = (int) ((tripRange - (tripRange * 0.2)) * 2);

                System.out.println("\nTotal price: " + tripRange + " TL");
                break;
        }
    }
}
