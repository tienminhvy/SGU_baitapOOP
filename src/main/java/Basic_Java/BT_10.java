package Basic_Java;

import java.util.Scanner;

public class BT_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        if (soNguyenTo(n))
            System.out.println("N la so nguyen to.");
        else System.out.println("N khong la so nguyen to.");
    }
    
    public static boolean soNguyenTo(int n) {
        if (n<2) return false;
        for (int i=2;i<=Math.sqrt(n);i++) 
            if (n%i==0) return false;
        return true;
    }
}
