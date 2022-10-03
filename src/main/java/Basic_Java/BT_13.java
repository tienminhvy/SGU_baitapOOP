package Basic_Java;

import java.util.Scanner;

public class BT_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        System.out.println("Ket qua cau a: "+calcA(n));
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        System.out.print("Ket qua cau b: "+calcB(n, x));
    }
    
    public static double calcA(int n) {
        double s = 2021;
        for (int i=2;i<=n;i++) {
            s+=(Math.pow(-1, i)*1.0)/giaiThua(i);
        }
        return s;
    }
    
    public static double calcB(int n, int x) {
        double s = 0;
        if (x>=1 && x<=50) {
            for(int i=1;i<=n;i++) {
                s+=Math.pow(x,i)/giaiThua(x+i);
            }
            return s;
        }
        return 0;
    }
    
    public static int giaiThua(int n) {
        if (n<2) return 1;
        return n*giaiThua(n-1);
    }
}
