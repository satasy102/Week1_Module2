
/*Viết chương trình cho phép tạo ra một ma trận 2 chiều (vuông) có kích cỡ n x n được nhập vào từ bàn phím, gồm các giá
trị số nguyên được sinh ngẫu nhiên từ 10 đến 90.
        Yêu cầu:
        1. Tính tổng các số chẵn trong ma trận
        2. Tính tổng các giá trị trên đường chéo chính
        3. Tính tổng các giá trị trên đường chéo phụ
        4. Tính tổng các giá trị trên đường biên
        5. Hiển thị ma trận
        6. Hiển trị ma trận tam giác dưới
        7. Hiển thị ma trân tam giác trên*/

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap so nguyen n:");
        int n=checkInput();

        while (n<2){
            System.out.println("n phai hon hon 2");
            n=checkInput();
        }

        int[][] matrix= new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 80+10);
            }
        }

        System.out.println("Menu");
        System.out.println("1. Tính tổng các số chẵn trong ma trận");
        System.out.println("2. Tính tổng các giá trị trên đường chéo chính");
        System.out.println("3. Tính tổng các giá trị trên đường chéo phụ");
        System.out.println("4. Tính tổng các giá trị trên đường biên");
        System.out.println("5. Hiển thị ma trận");
        System.out.println("6. Hiển trị ma trận tam giác dưới");
        System.out.println("7. Hiển thị ma trân tam giác trên");
        System.out.println("0. Exit");

        System.out.println("Enter your choice: ");
        int choice=checkInput();

        while (choice!=0){
            switch (choice){
                case 1 -> tinhTong(matrix);
                case 2 -> tinhTongDuongCheoChinh(matrix);
                case 3 -> tinhTongDuongCheoPhu(matrix);
                case 4 -> tinhTongDuongBien(matrix);
                case 5 -> hienThiMaTran(matrix);
                case 6 -> hienThiMaTranTamGiacTren(matrix);
                case 7 -> hienThiMaTranTamGiacDuoi(matrix);
                default -> System.out.println("Khong co lua chon do!");
            }
            System.out.println("Menu");
            System.out.println("1. Tính tổng các số chẵn trong ma trận");
            System.out.println("2. Tính tổng các giá trị trên đường chéo chính");
            System.out.println("3. Tính tổng các giá trị trên đường chéo phụ");
            System.out.println("4. Tính tổng các giá trị trên đường biên");
            System.out.println("5. Hiển thị ma trận");
            System.out.println("6. Hiển trị ma trận tam giác dưới");
            System.out.println("7. Hiển thị ma trân tam giác trên");
            System.out.println("0. Exit");

            System.out.println("Ban muon gi?");
            choice=checkInput();
        }
    }

    static int checkInput(){
        String str=null;
        int n;
        Scanner scanner=new Scanner(System.in);

        while (true){
            try{
                str=scanner.nextLine();
                n =Integer.parseInt(str);
                break;
            }
            catch (Exception ex){
                System.out.printf("%s khong phai la so. Moi nhap lai: ",str);
            }
        }

        return n;
    }

    static void tinhTong(int[][] ar){
        int sum=0;
        for(int rows=0;rows< ar.length;rows++){
            for (int cols=0;cols<ar.length;cols++){
                if(ar[rows][cols]%2==0){
                    sum+=ar[rows][cols];
                }
            }
        }
        System.out.println("Tong cac so chan cua mang la: "+sum);
    }

    static void tinhTongDuongCheoChinh(int[][] ar){
        int sum=0;
        for(int i=0;i< ar.length;i++){
            sum+=ar[i][i];
        }
        System.out.println("Tong cac so duong cheo chinh cua mang la: "+sum);
    }

    static void tinhTongDuongCheoPhu(int[][] ar){
        int sum=0;
        for(int i=0;i< ar.length;i++){
                sum+=ar[i][ar.length-1-i];
        }
        System.out.println("Tong cac so duong cheo phu cua mang la: "+sum);
    }

    static void tinhTongDuongBien(int[][] ar){
        int sum=0;
        for (int rows=0;rows< ar.length;rows++){
            sum+=ar[rows][0]+ar[rows][ar.length-1];
            for (int cols = 1; cols < ar.length-1; cols++) {
                    sum += ar[0][cols] + ar[ar.length-1][cols];
            }
        }
        System.out.println("Tong duong bien la: "+sum);
    }

    static void hienThiMaTran(int[][] ar){
        System.out.println("Ma tran la:");
        for (int row = 0; row < ar.length; row++) {
            for (int column = 0; column < ar[row].length; column++) {
                System.out.print(ar[row][column] + " ");
            }
            System.out.println();
        }
    }

    static void hienThiMaTranTamGiacTren(int[][] ar){
        System.out.println("Ma tran tren:");
        for (int rows=0;rows< ar.length;rows++){
            for(int cols=0;cols<rows;cols++){
                System.out.print(0 +"  ");
            }
            for (int cols=rows;cols< ar.length;cols++){
                System.out.print(ar[rows][cols]+" ");
            }
            System.out.print("\n");
        }
    }

    static void hienThiMaTranTamGiacDuoi(int[][] ar){
        System.out.println("Ma tran duoi:");
        for (int rows=0;rows< ar.length;rows++){
            for(int cols=0;cols<=rows;cols++){
                System.out.print(ar[rows][cols]+" ");
            }
            for (int cols=rows+1;cols< ar.length;cols++){
                System.out.print(0+"  ");
            }
            System.out.print("\n");
        }
    }
}
