package ClassVsObj;

import java.util.Scanner;

public class HinhChuNhat {
    private int chieuDai, chieuRong;
    public static Scanner sc = new Scanner(System.in);

    public HinhChuNhat() {
    }

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }
    
    public int dienTich() {
        return this.chieuDai*this.chieuRong;
    }
    
    public int chuVi() {
        return (this.chieuDai+this.chieuRong)*2;
    }
    
    public void nhap() {
        System.out.print("Nhap chieu dai: ");
        this.setChieuDai(sc.nextInt());
        System.out.print("Nhap chieu rong: ");
        this.setChieuRong(sc.nextInt());
    }

    public String toString() {
        return "Tam giac co chieu dai: "+this.chieuDai+", chieu rong: "+this.chieuRong+
        ", chu vi: "+this.chuVi()+", dien tich: "+this.dienTich();
    }
    
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(5, 6);
        System.out.println(hcn.toString());
        hcn.nhap();
        System.out.println(hcn.toString());
    }
}
