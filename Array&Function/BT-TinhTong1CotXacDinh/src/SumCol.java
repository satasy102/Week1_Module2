import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so hang:");
        int rows = 0;
        rows = checkInput(rows);

        System.out.println("Nhap so cot: ");
        int cols = 0;
        cols = checkInput(cols);

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < cols; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("Ban muon tinh tong cot thu bao nhieu?");
        int colss = 0;
        colss = checkInput(colss);

        int total = 0;
        while (colss <= 0 || colss > cols) {
            System.out.println("Khong co cot nay. Moi nhap lai:");
            colss = checkInput(colss);
        }

        for (int row = 0; row < rows; row++) {
            total += matrix[row][colss - 1];
        }
        System.out.println("Sum for column " + cols + " is " + total);


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
