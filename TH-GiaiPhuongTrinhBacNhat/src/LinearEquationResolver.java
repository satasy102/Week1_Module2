import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap a: ");
        double a=scanner.nextDouble();

        System.out.println("Nhap b: ");
        double b=scanner.nextDouble();

        if(a!=0) {
            double x = -b / a;
            System.out.println("Result x: " + x);
        } else if (b==0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else  {
            System.out.println("Phuong trinh vo nghiem");
        }

    }
}
