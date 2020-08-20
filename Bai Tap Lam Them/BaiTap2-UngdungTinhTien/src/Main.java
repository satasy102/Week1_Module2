import java.util.ArrayList;
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
public class Main {
    public static ArrayList<Table> tables = new ArrayList<>();
    public static Drink coca = new Drink("Coca", 7000, 100);
    public static Drink sting = new Drink("Sting", 7000, 100);
    public static Drink cafeSua = new Drink("Cafe Sua", 15000, 100);
    public static Drink cafeDa = new Drink("Cafe Da", 12000, 100);
    public static Drink[] drinks = {coca, sting, cafeSua, cafeDa};
    public static byte index;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Order[] o1 = new Order[4];
        Order[] o2 = new Order[4];
        Order[] o3 = new Order[4];
        Order[] o4 = new Order[4];
        Order[] o5 = new Order[4];
        Order[] o6 = new Order[4];
        Order[] o7 = new Order[4];
        Order[] o8 = new Order[4];
        Order[] o9 = new Order[4];
        Order[] o10 = new Order[4];

        Table b1 = new Table("B1", true, o1);
        Table b2 = new Table("B2", true, o2);
        Table b3 = new Table("B3", true, o3);
        Table b4 = new Table("B4", true, o4);
        Table b5 = new Table("B5", true, o5);
        Table b6 = new Table("B6", true, o6);
        Table b7 = new Table("B7", true, o7);
        Table b8 = new Table("B8", true, o8);
        Table b9 = new Table("B9", true, o9);
        Table b10 = new Table("B10", true, o10);

        tables.add(b1);
        tables.add(b2);
        tables.add(b3);
        tables.add(b4);
        tables.add(b5);
        tables.add(b6);
        tables.add(b7);
        tables.add(b8);
        tables.add(b9);
        tables.add(b10);

        hienThiTable();
        chonBan();

    }

    public static void hienThiTable() {
        System.out.printf("%-20s%s", "ID BAN", "TRANG THAI\n");
        for (Table table : tables) {
            if (table.isAvailable()) {
                System.out.printf("%-20s%s", table.getiDTable(), "Chua su dung\n");
            } else System.out.printf("%-20s%s", table.getiDTable(), "Dang su dung\n");
        }
    }

    public static void chonBan() {
        boolean check = false;
        System.out.print("Nhap ID Ban can chon:");
        String idBan = sc.nextLine();
        idBan = idBan.toUpperCase();
        for (byte i = 0; i < tables.size(); i++) {
            if (tables.get(i).getiDTable().equals(idBan)) {
                check = true;
                index = i;
                break;
            }
        }
        if (check) goiMon();
    }

    public static void goiMon() {
        if (tables.get(index).isAvailable()) {
            System.out.println("Ban " + tables.get(index).getiDTable() + " Chua su dung. Ban muon chon mon gi?");
            themDoUong();
        } else {
            System.out.println("Ban " + tables.get(index).getiDTable() + " Dang su dung");
            System.out.println("Ban muon cap nhat them do uong?");
            themDoUong();
        }
    }

    public static void themDoUong() {
        menuDoUong();
        System.out.println("Nhap so de chon do uong.");
        int doUongNhap = 0;
        doUongNhap = checkNum(doUongNhap);
        int indexOrder = 0;

        while (doUongNhap!=0) {
            switch (doUongNhap) {
                case 1:
                    int slMon = soLuongGoiMon();
                    coca.giamSoLuong(slMon);
                    Order coca = new Order("Coca", slMon);
                    tables.get(index).getOrders()[indexOrder]=coca;
                    indexOrder++;
                    break;
                case 2:
                    slMon = soLuongGoiMon();
                    sting.giamSoLuong(slMon);
                    Order sting = new Order("Sting", slMon);
                    tables.get(index).getOrders()[indexOrder]=sting;
                    indexOrder++;
                    break;
                case 3:
                    slMon = soLuongGoiMon();
                    cafeSua.giamSoLuong(slMon);
                    Order cafeSua = new Order("Cafe Sua", slMon);
                    tables.get(index).getOrders()[indexOrder]=cafeSua;
                    indexOrder++;
                    break;
                case 4:
                    slMon = soLuongGoiMon();
                    cafeDa.giamSoLuong(slMon);
                    Order cafeDa = new Order("Cafe Da", slMon);
                    tables.get(index).getOrders()[indexOrder]=cafeDa;
                    indexOrder++;
                    break;
                default:
                    System.out.println("Nhap sai. Moi nhap lai:");
                    doUongNhap = checkNum(doUongNhap);
            }
            hienThiTable();
        }

        hienThiTable();


    }

    private static int soLuongGoiMon() {
        System.out.println("So luong goi:");
        return sc.nextInt();
    }

    private static void menuDoUong() {
        System.out.printf("%-20s%-20s%s", "TEN", "SL TRONG KHO", "DON GIA\n");
        for (Drink value : drinks) {
            System.out.printf("%-20s%-20d%d\n", value.getDoUong(), value.getSoLuong(), value.getDonGia());
        }
    }

    public static int checkNum(int a) {
        String str = null;

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

