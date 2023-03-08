package Series;
public class series1 {
    public static void main(String[]args) {

        int s = 0;

        for (int x = 1; x <= 10; x++) {
            int p = 1;
            for (int y = 1; y <= x; y++) {
                p = p * y;
            }
            s = s + p;
        }
        System.out.println(s);
    }
}
