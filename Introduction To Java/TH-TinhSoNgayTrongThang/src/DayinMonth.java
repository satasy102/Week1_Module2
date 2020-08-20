import java.util.Scanner;

public class DayinMonth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap thang can tim: ");
        int month=scanner.nextInt();

        String dayinmonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayinmonth="31";
                break;
            case 2:
                dayinmonth="28 hoac 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayinmonth="30";
                break;
            default:
                dayinmonth="";
        }
        if (dayinmonth != "")
            System.out.printf("Thang %d co %s ngay!", month, dayinmonth);
         else
             System.out.println("Thang nhap khong dung");
    }
}
