import java.util.Scanner;

public class Ketqua {
    public static void main(String[] args) {

        System.out.println("Nhap a:");
        double a= checkInput();
        System.out.println("Nhap b:");
        double b= checkInput();
        System.out.println("Nhap c:");
        double c= checkInput();

        QuadraticEquation phuongtrinhbac2=new QuadraticEquation(a,b,c);

        if(phuongtrinhbac2.getA()==0){
            if(phuongtrinhbac2.getB()==0){
                System.out.print("phuong trinh vo so nghiem");
            }
            else{
                System.out.print("phuong trinh co nghiem duy nhat: "+phuongtrinhbac2.only());
            }
        }
        else{
            if (phuongtrinhbac2.getDiscriminant()<0){
                System.out.print("phuong trinh vo nghiem");
            }
            else{
                if(phuongtrinhbac2.getDiscriminant()==0){
                    System.out.print("phuong trinhg co nghiem kep: "+phuongtrinhbac2.doubleRoot());
                }
                else{
                    System.out.println("phuong trinh co 2 nghiem phan biet: ");
                    double r1= phuongtrinhbac2.getRoot1();
                    double r2= phuongtrinhbac2.getRoot2();
                    System.out.println("Nghiem r1: " +r1);
                    System.out.println("Nghiem r2: " +r2);
                }
            }
        }
    }

    public static double checkInput(){
        String str=null;
        double a;

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
        return a;
    }
}
