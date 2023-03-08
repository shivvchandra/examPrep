package Numbers;
import java.util.Scanner;
public class numberSumDigits {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int d;
        int s = 0;

        while (n != 0) {
            d = n % 10;
            n = n / 10;
            s = s + d;
        }

        System.out.println(s);
    }
}
