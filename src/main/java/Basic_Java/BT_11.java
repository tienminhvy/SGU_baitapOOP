package Basic_Java;

import java.util.Scanner;

public class BT_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        System.out.println("Cau a: ");
        cauA(n);
        System.out.println("Cau b: ");
        cauB(n);
        System.out.println("Cau c: ");
        cauC(n);
        System.out.println("Cau d: ");
        cauD(n);
        System.out.println("Cau e: ");
        cauE(n);
    }
    
    public static void cauA(int n) {
        System.out.println("Cac so tu nhien <= N.");
        int s = 0;
        for(int i=0;i<=n;i++)
        {
            s+=i;
            if (i==n) System.out.println(i);
            else System.out.print(i+",");
        }
        System.out.println("Tong cua chung la: "+s);
    }
    
    public static void cauB(int n) {
        System.out.println("Cac so tu nhien chan <= N.");
        int s = 0;
        for(int i=0;i<=n;i++)
        {
            if (i%2==0) {
                s+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.println("Tong cua chung la: "+s);
    }
    
    public static void cauC(int n) {
        System.out.println("Cac so tu nhien le <= N.");
        int s = 0;
        for(int i=0;i<=n;i++)
        {
            if (i%2!=0) {
                s+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.println("Tong cua chung la: "+s);
    }
    
    public static void cauD(int n) {
        System.out.println("Cac so nguyen to <= N.");
        int s = 0;
        for(int i=0;i<=n;i++)
        {
            if (soNguyenTo(i)) {
                s+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.println("Tong cua chung la: "+s);
    }
    
    public static void cauE(int n) {
        System.out.println("N so nguyen to dau tien:");
        int count = 0, i = 0;
        while(count<=n) {
            if (soNguyenTo(i)) {
                count++;
                System.out.print(i+" ");
            }
            i++;
        }
    }
    
    public static boolean soNguyenTo(int n) {
        if (n<2) return false;
        for (int i=2;i<=Math.sqrt(n);i++) 
            if (n%i==0) return false;
        return true;
    }
}
