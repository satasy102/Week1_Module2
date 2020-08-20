import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};

        System.out.print("Mang ban dau: ");
        for (int element : array) {
            System.out.print(element + " ");
        }

        System.out.println("\nNhap so can chen:");
        int num = 0;
        num = checkInput(num);

        System.out.println("Ban muon chen vao vi tri nao?");
        int viTri = 0;
        viTri = checkInput(viTri);
        int index = viTri - 1;

        while (index < 0 || index >= array.length) {
            System.out.println("Chi so vi tri bi sai. Nhap lai:");
            viTri = checkInput(viTri);
            index = viTri - 1;
        }

        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = num;

        System.out.println("\nMang sau khi chen: ");
        for (int element : array)
            System.out.print(element + " ");

    }

    public static int checkInput(int a) {
        String str = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                str = sc.nextLine();
                a = Integer.parseInt(str);
                break;
            } catch (Exception ex) {
                System.out.println("Khong phai so. Nhap lai:");
            }
        }
        return a;
    }
}
