import java.util.Scanner;

public class MerArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Nhap kich thuoc mang 1. lengthArr1:");
        byte lengthArr1=input.nextByte();

        int[] arr1= new int[lengthArr1];
        System.out.print("Nhap cac phan tu cua mang: \n");
        for(byte i=0;i<lengthArr1;i++){
            System.out.printf("arr1[%d] = ", i);
            arr1[i]=input.nextInt();
        }

        System.out.println("Nhap kich thuoc mang 1. lengthArr2:");
        byte lengthArr2=input.nextByte();

        int[] arr2= new int[lengthArr2];
        System.out.println("Nhap cac phan tu cua mang: ");
        for(byte i=0;i<lengthArr2;i++){
            System.out.printf("arr2[%d] = ", i);
            arr2[i]=input.nextInt();
        }

        int[] arr3= new int[lengthArr1+lengthArr2];
        int j=0;
        for (int i=0;i<arr1.length;i++) {
            arr3[i]=arr1[i];
        }
        for (int i=lengthArr1;i<arr3.length;i++) {
            arr3[i]=arr2[j];
            j++;
        }

        System.out.println("Mang sau khi gop la: ");
        for(int element:arr3) {
            System.out.printf("%d ",element);
        }
    }
}
