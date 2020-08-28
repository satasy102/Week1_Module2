import java.util.ArrayList;
import java.util.Date;
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
public class UngDung {
    private static final ArrayList<Table> table = new ArrayList<>();
    private static final Drink COCA = new Drink("Coca", 7000, 100);
    private static final Drink STING = new Drink("Sting", 7000, 100);
    private static final Drink CAFE_SUA = new Drink("Cafe Sua", 15000, 100);
    private static final Drink CAFE_DA = new Drink("Cafe Da", 12000, 100);
    private static final Drink[] drinks = {COCA, STING, CAFE_SUA, CAFE_DA};
    private static final Table b1 = new Table(1, false);
    private static final Table b2 = new Table(2, false);
    private static final Table b3 = new Table(3, false);
    private static final Table b4 = new Table(4, false);
    private static final Table b5 = new Table(5, false);
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        table.add(b1);
        table.add(b2);
        table.add(b3);
        table.add(b4);
        table.add(b5);

        menu();
        System.out.println("Chon ban:");
        int input = 0;
        input = checkNum(input);
        while (input != 0) {
            switch (input) {
                case 1 -> order(table.get(0));
                case 2 -> order(table.get(1));
                case 3 -> order(table.get(2));
                case 4 -> order(table.get(3));
                case 5 -> order(table.get(4));
                default -> System.out.println("Sai du lieu nhap.");
            }
            menu();
            input=checkNum(input);
        }
    }

    public static void menu() {
        System.out.printf("%-5s%s\n", "ID", "STATUS");
        for (Table tables : table) {
            tables.displayStatusTable();
        }
        System.out.printf("%-5s%s\n", "0","THOAT");
    }

    public static void order(Table b) {
        if (b.isStatus()) {
            System.out.println("Ban dang dung");
            hoaDon(b);
            System.out.println("1. Cap Nhat Do Uong");
            System.out.println("2. Them Do Uong");
            System.out.println("3. Tinh Tien");
            System.out.println("0 THOAT");
            int choose=0;
            choose=checkNum(choose);
            switch (choose) {
                case 1 -> {
                    System.out.println("Cap nhat do uong:");
                    drinksOrder(b);
                }
                case 2 -> {
                    System.out.println("Chon do uong:");
                    orderDrinks(b);
                }
                case 3 -> {
                    xuatHoaDon(b);
                }
                default -> System.out.println("Sai du lieu.");
            }
        } else {
            System.out.println("Chon do uong:");
            orderDrinks(b);
            b.setStatus(true);
        }
    }

    private static void xuatHoaDon(Table b) {
        hoaDon(b);
        b.setStatus(false);
        Date ngayXuatHoaDon=new Date();
        System.out.println("Ngay xuat hoa don: " + ngayXuatHoaDon);
    }

    public static void hoaDon(Table b) {
        int stt = 0;
        long tongTien=0;
        System.out.printf("%s   %-10s%-10s%-10s%-10s\n", "STT", "TEN", "SO LUONG","DON GIA", "THANH TIEN");
        for (Order order : b.getOrders()) {
            stt++;
            System.out.print(" "+stt + "    ");
            for(Drink drink: drinks) {
                if(drink.getTenDoUong().equals(order.getTenMon())){
                    order.displayOrder(drink);
                    tongTien+=order.thanhTien(drink);
                }
            }

        }

        System.out.printf("%35s%7d\n", "TONG TIEN: ", tongTien);

    }

    public static void drinksOrder(Table b) {
        hoaDon(b);
        System.out.println("Chon do uong:");
        int choose = 0;
        choose = checkNum(choose);
        while (choose != 0) {
            switch (choose) {
                case 1 -> updateSLMon(b, 1);
                case 2 -> updateSLMon(b, 2);
                case 3 -> updateSLMon(b, 3);
                case 4 -> updateSLMon(b, 4);
                default -> System.out.println("Khong co lua chon nay.");
            }
            displayDrink();
            System.out.println("Bam so de tiep tuc. Bam 0 de thoat");
            choose = checkNum(choose);
        }

        if(b.getOrders().size()==0) b.setStatus(false);
    }

    private static void updateSLMon(Table b, int n) {
        int i = n - 1;
        String tenMon = b.getOrders().get(i).getTenMon();
        System.out.println(tenMon + ":");

        int slMon = nhapSLMon();

        int slMonLucTruoc=b.getOrders().get(i).getSlMon();

        b.getOrders().get(i).setSlMon(slMon);

        if(slMon==0) b.getOrders().remove(b.getOrders().get(i));

        for(Drink drink: drinks) {
            String tenDoUong = drink.getTenDoUong();

            if (tenMon.equals(tenDoUong)){

                slMon=slMon-slMonLucTruoc;

                drink.giamSoLuong(slMon);
            }
        }
    }

    private static int nhapSLMon() {
        System.out.println("Nhap so luong mon:");
        int slMon = 0;
        slMon = checkNum(slMon);

        while (slMon<0){
            System.out.println("Sai du lieu. Nhap lai");
            slMon=checkNum(slMon);
        }
        return slMon;
    }

    public static void displayDrink() {
        int stt = 0;
        System.out.printf("%s   %-10s%-10s%-20s\n", "STT", "TEN", "SO LUONG", "DON GIA");
        for (Drink drink : drinks) {
            stt++;
            System.out.print(" "+stt + "    ");
            drink.hienThiDanhSachDoUong();
        }
    }

    public static void orderDrinks(Table b){
        displayDrink();
        System.out.println("Chon do uong:");
        int choose = 0;
        choose = checkNum(choose);
        while (choose != 0) {
            switch (choose) {
                case 1 ->  inputOrderDrink(b,"Coca", COCA);
                case 2 ->  inputOrderDrink(b,"Sting", STING);
                case 3 ->  inputOrderDrink(b,"Cafe Sua", CAFE_SUA);
                case 4 ->  inputOrderDrink(b,"Cafe Da", CAFE_DA);
                default -> System.out.println("Sai du lieu.");
            }
            displayDrink();
            System.out.println("Bam so de tiep tuc. Bam 0 de thoat");
            choose = checkNum(choose);
        }
    }

    public static void inputOrderDrink(Table b, String tenMon, Drink drink){
        int slMon=nhapSLMon();

        while (slMon>drink.getSoLuong()){
            System.out.println("So luong vuot qua hang ton. Nhap lai:");
            slMon=checkNum(slMon);
        }

        drink.giamSoLuong(slMon);
        Order order=new Order(tenMon,slMon);

        b.addOrders(order);

        if(slMon==0) b.getOrders().remove(order);
    }

    public static int checkNum(int a) {
        String str;

        while (true) {
            try {
                str = sc.nextLine();
                a = Integer.parseInt(str);
                break;
            } catch (Exception ex) {
                System.out.println("Khong phai so. Nhap lai: ");
            }
        }
        return a;
    }
}

