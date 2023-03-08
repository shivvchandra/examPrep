package Menu;
import java.util.Scanner;
public class tripleChoice {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = sc.nextInt();

        System.out.println("Input 1 for buzz number");
        System.out.println("Input 2 for even/odd check");
        System.out.println("Input 3 for negative/positive check");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                int d = n % 10;
                if (n % 7 == 0 || d == 7) {
                    System.out.println("Number is buzz number");
                }
                else {
                    System.out.println("Number is not buzz number");
                }
                break;

            case 2:
                if (n % 2 == 0) {
                    System.out.println("Number is even");
                }
                else {
                    System.out.println("Number is odd");
                }
                break;

            case 3:
                if (n > 0) {
                    System.out.println("Number is positive");
                }
                else {
                    System.out.println("Number is negative");
                }
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
