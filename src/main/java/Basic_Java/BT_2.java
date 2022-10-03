package Basic_Java;


import java.util.Scanner;

public class BT_2 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        System.out.println("Tong a+b: "+ (int)(a+b));
        System.out.println("Hieu a-b: "+ (a-b));
        System.out.println("Tich a*b: "+ a*b);
        System.out.println("Thuong a/b: "+ a/b);
    }
}
