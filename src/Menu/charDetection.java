package Menu;
import java.util.Scanner;
public class charDetection {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.print("Letter is capital");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.print("Letter is lowercase");
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.print(" and a vowel");
        }
        else {
            System.out.print(" and a consonant");
        }
    }
}
