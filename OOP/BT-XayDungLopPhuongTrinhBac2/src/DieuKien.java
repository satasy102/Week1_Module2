public class DieuKien {
    PhuongTrinhBac2 pt=new PhuongTrinhBac2();

    public void nhapPt(){
        pt.nhap();
    }

    public void ketQua(){
        if(pt.a==0){
            if(pt.b==0){
                System.out.print("phuong trinh vo so nghiem");
            }
            else{

                System.out.print("phuong trinh co nghiem duy nhat: "+pt.only());
            }
        }
        else{
            if (pt.getDiscriminant()<0){
                System.out.print("phuong trinh vo nghiem");
            }

            else{
                if(pt.getDiscriminant()==0){
                    System.out.print("phuong trinhg co nghiem kep: "+pt.doubleRoot());
                }
                else{
                    System.out.println("phuong trinh co 2 nghiem phan biet: ");
                    double r1= pt.getRoot1();
                    double r2= pt.getRoot2();
                    System.out.println("Nghiem r1: " +r1);
                    System.out.println("Nghiem r2: " +r2);
                }
            }
        }
    }
}
