package Numbers;
import java.util.Scanner;
public class numberPronic {
    public static void main(String[]args) {
        System.out.println("PRONIC NUMBER IS A NUMBER IN WHICH TWO FACTORS ARE TWO CONSECUTIVE DIGITS");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pronicCheck = 0;

        for (int i = 1; i <= n-1; i++) {
            if (i * (i+1) == n) {
                pronicCheck = 1;
                break;
            }
        }

        if (pronicCheck == 1) {
            System.out.println(n + " is a Pronic number");
        }
        else {
            System.out.println(n + " is not a Pronic number");
        }
    }
}