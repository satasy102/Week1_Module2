import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap bac cua ma tran vuong:");
        byte n=scanner.nextByte();


        int[][] matrix = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}
