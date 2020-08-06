import java.util.Scanner;

public class CheckInput {
    public static void test(double a){
        String str=null;

        Scanner scanner=new Scanner(System.in);

        while (true){
            try{
                str=scanner.nextLine();
                a=Double.parseDouble(str);
                break;
            }
            catch (Exception ex){
                System.out.printf("%s khong phai la so. Moi nhap lai: ",str);
            }
        }
    }
}
