package Menu;
import java.util.Scanner;

public class areaShape {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter circle, square or rectangle");
        String choice = sc.next();

        switch(choice) {
            case "circle":
                System.out.println("input radius: ");
                double radius = sc.nextDouble();
                double areaC = radius * radius * 3.14;
                System.out.println("Area of circle: " + areaC);
                break;

            case "square":
                System.out.println("input side: ");
                double side = sc.nextDouble();
                double areaS = side * side;
                System.out.println("Area of square: " + areaS);
                break;

            case "rectangle":
                System.out.println("input side 1: ");
                double side1 = sc.nextDouble();
                System.out.println("input side 2: ");
                double side2 = sc.nextDouble();
                double areaR = side1 * side2;
                System.out.println("Area of rectangle: " + areaR);
                break;

            default:
                System.out.println("Invalid input!");
        }
    }
}
