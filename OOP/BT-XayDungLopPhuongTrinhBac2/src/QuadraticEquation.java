public class QuadraticEquation {
    private double a,b,c;
    public double r1,r2,delta;

    QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return  this.a;
    }

    public double getB() {
        return  this.b;
    }

    public double getC() {
        return  this.c;
    }

    public double  getDiscriminant(){
        return delta = getB()*getB()-4*getA()*getC();
    }

    public double only(){
        r1=-getC()/getB();
        return r1;
    }

    public double doubleRoot(){
        r1=-getB()/(2*getA());
        return r1;
    }

    public double getRoot1(){
        return r1=(-getB()+Math.pow(this.getDiscriminant(), 0.5))/2;
    }

    public double getRoot2(){
        return r2=(-getB()-Math.pow(this.getDiscriminant(), 0.5))/2;
    }
}
