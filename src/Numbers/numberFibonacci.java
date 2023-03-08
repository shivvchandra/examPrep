package Numbers;
import java.util.Scanner;
public class numberFibonacci {
    public static void main(String[]args) {
        System.out.println("FIBONACCI SERIES WHEN NEXT NUMBER IS SUM OF PREVIOUS TWO NUMBERS");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        System.out.print(a + " " + b);

        for (int i = 0; i <= f; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}