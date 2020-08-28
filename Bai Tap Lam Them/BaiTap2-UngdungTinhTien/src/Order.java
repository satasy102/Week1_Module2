public class Order {
    private String tenMon;
    private int slMon;

    public Order(String tenMon, int slMon) {
        this.tenMon = tenMon;
        this.slMon = slMon;
    }

    public int getSlMon() {
        return slMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon=tenMon;
    }

    public void setSlMon(int slMon) {
        this.slMon = slMon;
    }

    public long thanhTien(Drink drink){
        return drink.getDonGia()*this.slMon;
    }

    public void displayOrder(Drink drink){
        System.out.printf("%-10s%-10s%-10s%-10s\n",tenMon,slMon,drink.getDonGia(),thanhTien(drink));
    }
}
