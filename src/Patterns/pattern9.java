/*
    1
    22
    333
    444
    5555
*/

public class pattern9 {
    public static void main(String[]args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}