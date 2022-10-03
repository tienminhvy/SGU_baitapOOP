package Basic_Java;

import java.util.Scanner;

public class BT_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap a, b va c lan luot cua phuong trinh bac hai ax^2+bx+c=0: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a == 0)
        {
            if (b != 0)
                System.out.println("Phuong trinh co nghiem duy nhat la -c/b: "+ (-c/(double)b));
            else {
                if (c != 0)
                    System.out.println("Phuong trinh vo nghiem");
                else
                    System.out.println("Phuong trinh co nghiem voi moi x");
            }
        }
        else {
            double delta = Math.pow(b,2) - 4*a*c;
            
            if (delta < 0)
                System.out.println("Phuong trinh vo nghiem");
            else if (delta == 0)
                System.out.println("Phuong trinh co nghiem kep -b/2a: "+(-b/(double)(2*a)));
            else {
                double n1 = (-b+Math.sqrt(delta))/(2*a);
                double n2 = (-b-Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co nghiem 1 la (-b+sqrt(delta))/(2a): "+n1+" va (-b-sqrt(delta))/(2a): "+n2);
            }
        }
    }
}
