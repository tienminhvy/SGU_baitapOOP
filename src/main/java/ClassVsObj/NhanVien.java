package ClassVsObj;
import java.util.Scanner;

public class NhanVien {
    static Scanner sc = new Scanner(System.in);
    private String maso,hoten;
    private int ngayCong;
    private char xepLoai;
    static private int luongNgay = 200000;

    public NhanVien() {
    }

    public NhanVien(String maso, String hoten, int ngayCong, char xepLoai) {
        this.maso = maso;
        this.hoten = hoten;
        this.ngayCong = ngayCong;
        this.xepLoai = xepLoai;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(int ngayCong) {
        do {
            System.out.print("Nhap so ngay cong: ");
            ngayCong = Integer.parseInt(sc.nextLine());
            if (ngayCong <= 0) System.out.println("So ngay cong phai lon hon 0.");
        } while (ngayCong <= 0);
        this.ngayCong = ngayCong;
    }

    public char getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(char xepLoai) {
        if (this.ngayCong > 26) xepLoai = 'A';
        else if (this.ngayCong >= 22 && this.ngayCong <= 26) xepLoai = 'B';
        else xepLoai = 'C';
        this.xepLoai = xepLoai;
    }

    public static int getLuongNgay() {
        return luongNgay;
    }

    public static void setLuongNgay(int luongNgay) {
        NhanVien.luongNgay = luongNgay;
    }
    
    public void nhap() {
        System.out.print("Nhap ho ten nhan vien: ");
        this.setHoten(sc.nextLine());
        System.out.print("Nhap ma so nhan vien: ");
        this.setMaso(sc.nextLine());
        this.setNgayCong(0);
        this.setXepLoai(' ');
    }
    
    public void xuat() {
        System.out.println("Thong tin nhan vien: ");
        System.out.println("Ho ten: "+this.getHoten());
        System.out.println("Ma so: "+this.getMaso());
        System.out.println("Ngay cong: "+this.getNgayCong());
        System.out.println("Xep loai: "+this.getXepLoai());
    }
    
    public int luong() {
        return this.ngayCong*this.luongNgay;
    }
    
    public double thuong() {
        double thuong = 0;
        switch (this.xepLoai) {
            case 'A':
                thuong = this.luong()*0.05;
                break;
            case 'B':
                thuong = this.luong()*0.02;
                break;
            default:
                break;
        }
        return thuong;
    }
    
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.nhap();
        nv.xuat();
    }
}
