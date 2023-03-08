package Numbers;
import java.util.Scanner;
public class numberSpy {
    public static void main(String[]args) {
        System.out.println("SPY NUMBER IS A NUMBER WHERE THE SUM OF DIGITS IS EQUAL TO THE PRODUCT OF DIGITS");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int n = number;
        int s = 0;
        int p = 1;
        int d;

        while (n != 0) {
            d = n % 10;
            n = n / 10;
            s = s + d;
            p = p * d;
        }

        System.out.println("Sum of digits: " + s);
        System.out.println("Product of digits: " + p);

        if (s == p) {
            System.out.println(number + " is a Spy number");
        }
        else {
            System.out.println(number + " is not a Spy number");
        }
    }
}
