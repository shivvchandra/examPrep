package Slab;
import java.util.Scanner;
public class ticketCharges {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input price of ticket: ");
        double ticketAmount = sc.nextInt();
        double discountPercent = 0;
        double discount;
        double ticketPrice;

        if (ticketAmount > 25000 && ticketAmount < 35001) {
            discountPercent = 0.05;
        }

        else if (ticketAmount > 35000 && ticketAmount < 55001) {
            discountPercent = 0.10;
        }

        else if (ticketAmount > 55000 && ticketAmount < 70001) {
            discountPercent = 0.15;
        }

        else if (ticketAmount > 70000) {
            discountPercent = 0.20;
        }

        else {
            discountPercent = 0;
        }

        discount = ticketAmount * discountPercent;
        ticketPrice = ticketAmount - discount;

        System.out.println("Original ticket amount: "+ ticketAmount);
        System.out.println("Discount: "+ discount);
        System.out.println("Final Ticket Price: "+ ticketPrice);

    }
}