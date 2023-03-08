package Patterns;
public class pattern13 {
    public static void main(String[]args) {

        char n = 'a';

        for(int i = 1; i <= 5; i++) {
        n = 'a';
            for(int j = 1; j <= i; j++) {
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}