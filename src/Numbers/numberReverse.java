package Numbers;
import java.util.Scanner;
public class numberReverse {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d;
        int r = 0;

        while (n != 0) {
            d = n % 10;
            n = n / 10;
            r = (r * 10) + d;
        }

        System.out.println(r);
    }
}
