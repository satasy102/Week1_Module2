import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i=0;i< array.length;i++){
            array[i]=(int) (Math.random()*100);
        }

        System.out.print("Value: ");
        for (int element:array) {
            System.out.print(element + " ");
        }

        System.out.println("\nEnter number need to delete:");
        int number=0;
        number = checkInput(number);

        boolean check=false;

        for (int i = 0; i < array.length; i++) {
            if (array[i]==number) {
                for (int j=i;j< array.length-1;j++){
                    array[j]=array[j+1];
                }
                array[array.length-1]=0;
                i--;
                check=true;
            }
        }

        if(check) {
            System.out.printf("\nDelete number '%d'.\nNew value: ",number);
            for (int element : array) {
                System.out.print(element + " ");
            }
        } else System.out.println("\nSo "+number+" khong co trong mang");
    }

    public static int checkInput(int a){
        String str=null;
        Scanner sc=new Scanner(System.in);
        while (true){
            try {
                str=sc.nextLine();
                a=Integer.parseInt(str);
                break;
            }
            catch (Exception ex){
                System.out.println("Khong phai so. Nhap lai:");
            }
        }
        return a;
    }
}
