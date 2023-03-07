/*
    10
    98
    765
    4321
 */

public class pattern4 {
    public static void main(String[]args) {
            int n = 10;
            for(int i = 1; i <= 4; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print(n);
                    n--;
                }
                System.out.println();
        }
    }
}