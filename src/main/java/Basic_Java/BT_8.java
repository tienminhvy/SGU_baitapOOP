package Basic_Java;

import java.util.Scanner;

public class BT_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap a, b lan luot cua phuong trinh bac nhat ax+b=0: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a != 0)
            System.out.println("Phuong trinh co nghiem duy nhat la -b/a: "+ (-b/(double)a));
        else {
            if (b != 0)
                System.out.println("Phuong trinh vo nghiem");
            else
                System.out.println("Phuong trinh co nghiem voi moi x");
        }
    }
}
