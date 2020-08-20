import java.util.Scanner;

public class Calculate_Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();

        System.out.println("Enter number of months: ");
        month = scanner.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = scanner.nextDouble();

        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset += money * (interset_rate/100)/12 * month;
        }

        System.out.printf("%-20s%-20s%-20s%S","MONEY", "MONTH", "INTEREST", "TOTAL\n");
        System.out.printf("%-20.3f%-20d%-20.3f%.3f",money,month,interset_rate,total_interset);
    }
}
