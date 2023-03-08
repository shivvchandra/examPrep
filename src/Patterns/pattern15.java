package Patterns;
public class pattern15 {
    public static void main(String[]args) {

        char n = 'a';

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}
