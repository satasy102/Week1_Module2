import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        while (choice!=0) {
            switch (choice) {
                case 1 -> {
                    System.out.println("1. Print the rectangle");
                    System.out.println("Input width:");
                    int width = scanner.nextInt();
                    System.out.println("Input height:");
                    int height = scanner.nextInt();
                    for (int i = 1; i <= width; i++) {
                        for (int j = 1; j <= height; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                }
                case 2 -> {
                    System.out.println("2. Print the square triangle");
                    System.out.println("Input width:");
                    int width = scanner.nextInt();

                    for (int i = 1; i <= width; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                }
                case 3 -> {
                    System.out.println("3. Print isosceles triangle");
                    System.out.println("Input height:");
                    int height = scanner.nextInt();

                    for (int i=1; i<= height;i++){
                        for (int j=1; j<=height-i; j++) {
                            System.out.print(" ");
                        }
                        for (int j=1; j<=2*i-1; j++){
                            System.out.print("*");
                        }
                        System.out.println("\n");
                    }
                }
            }
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
        }
    }
}
