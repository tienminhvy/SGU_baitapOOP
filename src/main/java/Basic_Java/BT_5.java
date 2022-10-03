package Basic_Java;

import java.util.Scanner;

public class BT_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        if (n%2==0)
            System.out.println("N la so chan.");
        else System.out.println("N la so le.");
    }
}
