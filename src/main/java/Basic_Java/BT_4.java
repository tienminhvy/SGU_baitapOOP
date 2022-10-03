package Basic_Java;

import java.util.Scanner;

public class BT_4 {
    public static void main(String[] args) {
        double bk, chuVi, dienTich;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ban kinh hinh tron: ");
        bk = sc.nextDouble();
        
        System.out.println("Chu vi hinh tron: " + (2*Math.PI*bk));
        System.out.println("Dien tich hinh tron: " + (Math.PI*Math.pow(bk, 2)));
    }
}
