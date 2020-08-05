import java.util.Scanner;

public class PhuongTrinhBac2 {
    double a,b,c,r1,r2,delta;

    Scanner input=new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhap a: ");
        this.a=input.nextFloat();
        System.out.print("Nhap b: ");
        this.b=input.nextFloat();
        System.out.print("Nhap c: ");
        this.c=input.nextFloat();
    }

    private double getA() {
        return  this.a;
    }

    private double getB() {
        return  this.b;
    }

    private double getC() {
        return  this.c;
    }

    public double  getDiscriminant(){
        return delta = b*b-4*a*c;
    }

    public double only(){
        r1=-c/b;
        return r1;
    }

    public double doubleRoot(){
        r1=-b/(2*a);
        return r1;
    }

    public double getRoot1(){
        return r1=(-b+Math.pow(this.getDiscriminant(), 0.5))/2;
    }

    public double getRoot2(){
        return r2=(-b-Math.pow(this.getDiscriminant(), 0.5))/2;
    }
}
