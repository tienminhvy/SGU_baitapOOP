package Basic_Java;

import java.util.Scanner;

public class BT_6 {
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
            if (thang < 3) {
                thang+=12;
                nam-=1;
            }

            int n = (ngay+2*thang+(3*(thang+1))/5 + nam + (nam / 4)) % 7;

            System.out.print("Ngay da nhap la ");
            switch(n) {
                case 0:
                    System.out.println("chu nhat");
                    break;
                case 1:
                    System.out.println("thu hai");
                    break;
                case 2:
                    System.out.println("thu ba");
                    break;
                case 3:
                    System.out.println("thu tu");
                    break;
                case 4:
                    System.out.println("thu nam");
                    break;
                case 5:
                    System.out.println("thu sau");
                     break;
                case 6:
                    System.out.println("thu bay");
                    break;
            }
        } else System.out.print("Ngay da nhap khong hop le.");
    }
}
