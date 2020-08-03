import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        boolean isleapyear=false;
        if (year%4==0){
            if(year%100==0){
                if(year%400==0){
                   isleapyear=true;
                }
            } else isleapyear=true;
        }
        if(isleapyear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
