import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Enter number need to add:");
        int num = scanner.nextInt();

        System.out.println("Enter index need to add:");
        int index = scanner.nextInt();

        System.out.print("Mang ban dau: ");
        for (int element:array) {
            System.out.print(element + " ");
        }

        if (index < 0 || index >= array.length) {
            System.out.println("\nKhong chen duoc vao mang");
        } else {
            for (int i = array.length-1; i > index; i--) {
                array[i] = array[i-1];

            } array[index]=num;
            System.out.println("\nMang sau khi chen: ");
            for(int element: array)
                System.out.print(element+" ");
        }


    }
}
