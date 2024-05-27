package Lecture2;

public class Exercise4 {

        public static void main(String[] args) {
            int size = 7;
            printTree(size);
        }

        public static void printTree(int size) {
            for (int i = 0; i < size; i++) {
                for (int j = size - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < size - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }