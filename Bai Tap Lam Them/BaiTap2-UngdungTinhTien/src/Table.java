import java.util.ArrayList;
import java.util.List;

public class Table {

    private int iDTable;
    private boolean status = false;
    private List<Order> orders=new ArrayList<>();

    public Table() {}

    Table(int iDTable, boolean status) {
        this.iDTable=iDTable;
        this.status=status;
    }

    public int getiDTable() {
        return iDTable;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrders(Order order) {
        orders.add(order);
    }

    public void turnOffTable() {
        if (status) {
            this.status = false;
        }
        System.out.println("Chua su dung");
    }

    public void turnOnTable() {
        if (!status) {
            this.status = true;
        }
        System.out.println("Dang su dung");
    }

    public void displayStatusTable() {
        if (status) System.out.printf("%-5d%s\n", iDTable, "Dang su dung");
        else System.out.printf("%-5d%s\n", iDTable, "Chua su dung");
    }
}
