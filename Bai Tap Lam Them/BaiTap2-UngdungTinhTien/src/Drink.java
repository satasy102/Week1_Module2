public class Drink {
    private String tenDoUong;
    private long donGia;
    private int soLuong;

    Drink(String tenDoUong,long donGia,int soLuong) {
        this.tenDoUong=tenDoUong;
        this.donGia=donGia;
        this.soLuong=soLuong;
    }

    public String getTenDoUong() {
        return tenDoUong;
    }

    public String getDoUong() {
        return tenDoUong;
    }

    public void setDoUong(String doUong) {
        this.tenDoUong = doUong;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void giamSoLuong(int slMon){
        if(slMon<=this.soLuong) {
            this.soLuong -= slMon;
        }
    }

    public void hienThiDanhSachDoUong(){
        System.out.printf("%-10s%-10d%-20d\n",tenDoUong,soLuong,donGia);
    }
}
