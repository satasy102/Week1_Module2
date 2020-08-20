import java.util.Scanner;

public class Greatest_Common_Divisor {
    public static void main(String[] args) {
        int a;
        int b;
        int gcd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        a = scanner.nextInt();
        System.out.println("Enter number b: ");
        b = scanner.nextInt();

        System.out.printf("%-20s%-20s%s", "Number a", "Number b", "GCD\n");

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            System.out.printf("%-20d%-20d%s",a,b,"No greatest common factor");
        } else {
            if (a == 0 || b == 0) {
                gcd = a+b;
            } else {
                while (a != b) {
                    if (a > b) {
                        a -= b;
                    } else b -= a;
                }
                gcd = a;
            }
            System.out.printf("%-20d%-20d%d", a, b, gcd);
        }
    }

}

