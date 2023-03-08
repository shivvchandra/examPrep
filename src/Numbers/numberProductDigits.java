package Numbers;
import java.util.Scanner;
public class numberProductDigits {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int d;
        int p = 1;

        while (n != 0) {
            d = n % 10;
            n = n / 10;
            p = p * d;
        }

        System.out.println(p);
    }
}
