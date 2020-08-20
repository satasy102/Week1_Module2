public class Drink {
    private String tenDoUong;
    private long donGia;
    private  int soLuong;

    Drink(String tenDoUong,long donGia,int soLuong) {
        this.tenDoUong=tenDoUong;
        this.donGia=donGia;
        this.soLuong=soLuong;
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
            this.soLuong-=slMon;
        } else {
            System.out.println("Khong du so luong can order");
            System.out.println("So luong con lai trong kho la:" + this.soLuong);
        }
    }


    

}
