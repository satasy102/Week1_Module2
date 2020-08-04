import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 4, 6, 7, 8};

        System.out.println("Enter number need to delete:");
        int number = scanner.nextInt();

        System.out.print("Value: ");
        for (int element:array) {
            System.out.print(element + " ");
        }

        boolean check=true;
        for (int i = 0; i < array.length; i++) {
            if (number==array[i]) {
                for (int j=i;j< array.length-1;j++){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
                array[array.length-1]=0;
                check=true;
                break;
            } else check=false;
        }

        if(check) {
            System.out.print("\nNew value: ");
            for (int element : array) {
                System.out.print(element + " ");
            }
        } else System.out.println("\nSo "+number+" khong co trong mang");
    }
}
