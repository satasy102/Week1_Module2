import java.util.Scanner;

/*Sử dụng ngôn ngữ lập trình Java để xây dựng chương trình thực hiện thao tác tính tiền trong 1 quán
cafe như sau:
        1. Cho phép người dùng nhập bàn, và nhập các món thức uống của bàn đó. Nếu bàn đã tồn tại rồi
        thì cập nhật thêm thức uống. Dữ liệu nhập vào được lưu trong một mảng có tên Orders
        2. Cho phép người dùng thực hiện tao tác thanh toán cho một bàn nào đó. Nếu bàn chưa tồn tại
        thì thông báo Invalid table. Nếu bàn đã tồn tại (đang sử dụng) thì tiến hành xuất hóa đơn cho
        bàn đó ra( Hiển thị hoá đơn ra).
        Cần hiển thị số tiền của từng món và tổng tiền của hóa đơn; ngoài ra hiển thị thêm thông tin
        ngày giờ xuất hóa đơn.*/
public class Order {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so ban: ");
        int numTable=sc.nextInt();
        checkTable(numTable);
    }

    static void checkTable(int num){
        int[] table= new int[10];
        for(int i=0;i< table.length;i++){
            table[i]=i+1;
        }
        while (!table.equals(num)){
            System.out.println("Khong co ban nay. Nhap lai so ban:");
        }
        inputOrder();
    }

    static void inputOrder(){
        displayMonAn();
        String[] monAn= {"Coca","Sting","Cafe Sua","Cafe da", "Ep Cam"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Chon mon:");
        String chonMon=sc.nextLine();
        System.out.println("So luong:");
        int soLuong= sc.nextInt();
    }


}
