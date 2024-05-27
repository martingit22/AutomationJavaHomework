package Lecture2;
import java.util.Scanner;
public class Exercise5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the lengths of the three sides of the triangle:");
            System.out.print("Side 1: ");
            double side1 = scanner.nextDouble();

            System.out.print("Side 2: ");
            double side2 = scanner.nextDouble();

            System.out.print("Side 3: ");
            double side3 = scanner.nextDouble();

            double perimeter = calculatePerimeter(side1, side2, side3);
            System.out.println("The perimeter of the triangle is: " + perimeter);

            double area = calculateArea(side1, side2, side3);
            System.out.println("The area of the triangle is: " + area);

            scanner.close();
        }

        public static double calculatePerimeter(double side1, double side2, double side3) {
            return side1 + side2 + side3;
        }

        public static double calculateArea(double side1, double side2, double side3) {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
    }