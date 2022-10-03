package ClassVsObj;

import java.util.Scanner;

public class SinhVien {
    private String masv, hoten, lop;
    private double diemtb;
    private int tuoi;
    
    static Scanner sc = new Scanner(System.in);

    public SinhVien() {
    }

    public SinhVien(String masv, String hoten, String lop, double diemtb, int tuoi) {
        this.masv = masv;
        this.hoten = hoten;
        this.lop = lop;
        this.diemtb = diemtb;
        this.tuoi = tuoi;
    }
    
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        do {
            System.out.print("Nhap ma sinh vien: ");
            masv = sc.nextLine();
        } while (masv.length() > 8 || masv.length() == 0);
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        do {
            System.out.print("Nhap ho ten: ");
            hoten = sc.nextLine();
        } while (hoten.length() == 0);
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        boolean check = false;
        do {
            System.out.print("Nhap lop: ");
            lop = sc.nextLine();
            if (lop.length() > 3) {
                if ((lop.charAt(0) == 'D' && lop.charAt(1) == 'C' && lop.charAt(2) == 'T')
                        && lop.charAt(0) == 'D' && lop.charAt(1) == 'K' && lop.charAt(2) == 'P') {
                    check = true;
                }
            }
        } while (!check);
        this.lop = lop;
    }

    public double getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(double diemtb) {
        do {
            System.out.print("Nhap diem trung binh: ");
            diemtb = Double.parseDouble(sc.nextLine());
        } while (diemtb < 0 || diemtb > 10);
        this.diemtb = diemtb;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        do {
            System.out.print("Nhap tuoi: ");
            tuoi = Integer.parseInt(sc.nextLine());
        } while (tuoi < 18);
        this.tuoi = tuoi;
    }
    
    
}
