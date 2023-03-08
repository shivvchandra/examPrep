package Series;
import java.util.Scanner;
public class series2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double s = 0;

        for (double i = 1; i <= n; i++) {
            s = s + (1/i);
        }

        System.out.println(s);
    }
}
