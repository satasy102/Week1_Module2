import java.util.Scanner;

public class CountChar {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap 1 chuoi bat ky:");
        String chuoi=scanner.nextLine();
        while (chuoi.length()==0){
            System.out.println("Nhap 1 chuoi bat ky:");
            chuoi=scanner.nextLine();
        }


        System.out.println("Nhap ky tu can tim kiem:");
        char kyTu = scanner.next().charAt(0);
        byte count=0;

        for (byte i = 0; i < chuoi.length(); i++) {
                if (chuoi.charAt(i) == kyTu) {
                    count++;
                }
            }
            System.out.println("So lan xuat hien " + kyTu +" trong chuoi " + chuoi + " = " + count);
        }
    }

