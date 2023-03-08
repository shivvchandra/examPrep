package Numbers;
import java.util.Scanner;
public class numberPalindrome {
    public static void main(String[]args) {
        System.out.println("PALINDROME NUMBER IS A NUMBER WHOSE DIGITS ARE SAME BOTH WAYS");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int n = number;
        int s = 0;
        int d;

        while (n != 0 ) {
            d = n % 10;
            s = (s * 10) + d;
            n = n / 10;
        }

        System.out.println("Reversed number is: " + s);

        if (number == s) {
            System.out.println(number + " is a Palindrome number");
        }
        else {
            System.out.println(number + " is not a Palindrome number");
        }
    }
}