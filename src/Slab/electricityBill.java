package Slab;
import java.util.Scanner;
public class electricityBill {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input units: ");
        double units = sc.nextDouble();
        double price;

        if (units <= 100) {
            price = 1.25 * units;
            System.out.println("Price: " + price);
        }
        else if (units > 100 && units <= 200) {
            price = (1.25 * 100) + (1.5 * (units - 100));
            System.out.println("Price: " + price);
        }
        else if (units > 200) {
            price = (1.25 * 100) + (1.5 * 100) + ((units - 200) * 1.8);
            System.out.println("Price: " + price);
        }
    }
}
