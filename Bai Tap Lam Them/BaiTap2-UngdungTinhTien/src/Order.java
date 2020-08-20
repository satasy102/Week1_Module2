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

}
