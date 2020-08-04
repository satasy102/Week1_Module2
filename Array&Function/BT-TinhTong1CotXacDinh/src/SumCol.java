import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {



        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap so hang:");
        byte rows=scanner.nextByte();

        System.out.println("Nhap so cot: ");
        byte cols=scanner.nextByte();

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
        byte colss=scanner.nextByte();

        int total = 0;
        if (colss > 0 && colss < cols) {
            for (int row = 0; row < rows; row++) {
                total += matrix[row][colss-1];
            }
            System.out.println("Sum for column " + cols + " is "+ total);
        } else System.out.println("Khong co cot nay");
    }
}
