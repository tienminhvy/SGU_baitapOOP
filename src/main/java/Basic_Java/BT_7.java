package Basic_Java;

import java.util.Scanner;

public class BT_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ngay, thang, nam lan luot: ");
        int ngay = sc.nextInt();
        int thang = sc.nextInt();
        int nam = sc.nextInt();
        
        boolean nhuan = false, datyc = true;
        
        if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) nhuan = true;
        
        if (ngay <= 0 || ngay > 31) datyc = false;
        if (thang <= 0 || thang > 12) datyc = false;
        if (nam < 0) datyc = false;
        
        if (nhuan) {
            switch(thang) {
                case 2 -> {
                    if (ngay > 29) datyc = false;
                }
                case 4,6,9,11 -> {
                    if (ngay > 30) datyc = false;
                }
            }
        } else {
            switch(thang) {
                case 2 -> {
                    if (ngay > 28) datyc = false;
                }
                case 4,6,9,11 -> {
                    if (ngay > 30) datyc = false;
                }
            }
        }
        
        if (datyc) {
            ngay++;
            switch(thang) {
                case 2 -> {
                    if (nhuan) {
                        if (ngay > 29) {
                            ngay=1;
                            thang++;
                        }
                    } else {
                        if (ngay>28) {
                            ngay=1;
                            thang++;
                        }
                    }
                }
                case 1,3,5,7,8,10,12 -> {
                    if (ngay > 31) {
                        ngay=1;
                        thang++;
                    }
                    if (thang>12) {
                        thang=1;
                        nam++;
                    }
                }
                default -> {
                    if (ngay > 30) {
                        ngay = 1;
                        thang++;
                    }
                }
            }
            
            System.out.print("Ngay ke tiep cua ngay da nhap la: "+ngay+"/"+thang+"/"+nam);
        } else System.out.print("Ngay da nhap khong hop le.");
    }
}
