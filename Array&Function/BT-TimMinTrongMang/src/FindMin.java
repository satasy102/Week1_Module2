import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap Size:");
        byte size=scanner.nextByte();
        float[] arr=new float[size];

        for(int i=0;i<size;i++){
            System.out.print("Nhap arr["+i+"]: ");
            arr[i]=scanner.nextFloat();
        }
        float min=arr[0];
        for (int i=0;i<size;i++){
            if(min>arr[i]) min=arr[i];
        }

        System.out.println("\nGia tri nho nhat trong mang la: "+min);
    }
}
