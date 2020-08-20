import java.util.Scanner;

public class Table {

    private String iDTable;
    private boolean status = true;
    private Order[] orders=new Order[4];

    Table(String iDTable, boolean status, Order[] orders) {
        this.iDTable=iDTable;
        this.status=status;
        this.orders=orders;
    }

    public String getiDTable() {
        return iDTable;
    }

    public boolean isAvailable() {
        return status;
    }

    public void setAvalable(boolean status) {
        this.status = status;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public void turnOffTable() {
        if (!status) {
            this.status = true;
        }
        System.out.println("Dang su dung");
    }

    public void turnOnTable() {
        if (status) {
            this.status = false;
        }
        System.out.println("Dang su dung");
    }

    public void displayStatusTable() {
        if (status) System.out.printf("%-20s%s", iDTable, "Chua su dung");
        else System.out.printf("%-20s%s", iDTable, "Dang su dung");
    }
}
