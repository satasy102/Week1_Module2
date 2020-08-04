import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number= scanner.nextInt();

        boolean isPrime=true;

        if (number<2){
            isPrime=false;
        } else {
            for (int i = 2; i < number; i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.printf("%d is a prime",number);
            } else System.out.printf("%d is not a prime", number);
        }
    }
}
