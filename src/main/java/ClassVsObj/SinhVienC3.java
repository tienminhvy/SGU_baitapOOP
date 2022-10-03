package ClassVsObj;

public class SinhVienC3 {
    private int masv;
    private String hoTen;
    private float LT, TH;

    public SinhVienC3() {
        this.masv = 0;
        this.hoTen = "";
        this.LT = 0;
        this.TH = 0;
    }

    public SinhVienC3(int masv, String hoTen, float LT, float TH) {
        this.masv = masv;
        this.hoTen = hoTen;
        this.LT = LT;
        this.TH = TH;
    }

    public int getMasv() {
        return masv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getLT() {
        return LT;
    }

    public float getTH() {
        return TH;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLT(float LT) {
        this.LT = LT;
    }

    public void setTH(float TH) {
        this.TH = TH;
    }
    
    public double tinhDiemTB() {
        return (LT+TH)/2.0;
    }
    
    public String toString() {
        return "Sinh vien co ma sinh vien: "+this.masv+", ho ten: "+this.hoTen+
                ", diem LT: "+this.LT+", diem TH: "+this.TH;
    }
    
    public static void main(String[] args) {
        
    }
}
