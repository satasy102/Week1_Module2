import java.util.Scanner;

public class Currency_Conversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter type of currency need to conversion: USD or VND");
        String currency=scanner.nextLine();

        switch (currency) {
            case "USD": System.out.println("Enter USD: ");
                double usd=scanner.nextDouble();

                System.out.printf("%-30s%s","USD","VND\n");

                double vnd=usd*23000;

                System.out.printf("%-30.3f%.3f",usd,vnd);
                break;
            case "VND":
                System.out.println("Enter VND: ");
                vnd=scanner.nextDouble();

                System.out.printf("%-30s%s","VND","USD\n");

                usd=vnd/23000;

                System.out.printf("%-30.3f%.3f",vnd,usd);
                break;
            default: System.out.println("Don't have type of currency");
        }
    }
}
