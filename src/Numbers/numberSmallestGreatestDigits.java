package Numbers;
import java.util.Scanner;
public class numberSmallestGreatestDigits {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d;

        int max = 0;
        int min = max;

        while (n != 0) {
            d = n % 10;
            n = n / 10;
            if (d > max) {
                max = d;
            }
            else if (d < max) {
                min = d;
            }
            else {
                min = max;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
