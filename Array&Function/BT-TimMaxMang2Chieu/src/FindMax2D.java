import java.util.Scanner;

public class FindMax2D {
    public static void main(String[] args) {
        int rows, cols;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        rows = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        cols = scanner.nextInt();

        float[][] Arr = new float[rows][cols];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Arr[" + i + "]["+ j + "] = ");
                Arr[i][j] = scanner.nextInt();
            }
        }

        float max = Arr[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (max < Arr[i][j]) {
                    max = Arr[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}
