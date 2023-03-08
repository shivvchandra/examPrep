package Numbers;
import java.util.Scanner;
public class numberHarshad {
    public static void main(String[]args) {
        System.out.println("HARSHAD NUMBER IS A NUMBER WHERE THE NUMBER IS DIVISIBLE BY THE SUM OF ITS DIGITS");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int n = number;
        int s = 0;
        int d;

        while (n != 0) {
            d = n % 10;
            n = n / 10;
            s = s + d;
        }

        System.out.println("Sum of digits: " + s);

        if (number % s == 0) {
            System.out.println(number + " is a Harshad number");
        }
        else {
            System.out.println(number + " is not a Harshad number");
        }
    }
}