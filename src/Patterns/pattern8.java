/*
    7654321
    654321
    54321
    4321
    321
    21
    1
*/

public class pattern8 {
    public static void main(String[]args) {
        for(int i = 1; i <= 7; i++) {
            for(int j = 7; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}