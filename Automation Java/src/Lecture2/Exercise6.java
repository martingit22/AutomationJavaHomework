package Lecture2;
import java.util.Scanner;
public class Exercise6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");

            System.out.print("a: ");
            double a = scanner.nextDouble();

            System.out.print("b: ");
            double b = scanner.nextDouble();

            System.out.print("c: ");
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The roots of the quadratic equation are: " + root1 + " and " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The root of the quadratic equation is: " + root);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("The roots of the quadratic equation are: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
            }

            scanner.close();
        }
    }
