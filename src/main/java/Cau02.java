import java.util.Scanner;

public class Cau02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.println("a = "+a+", b = "+b);
        System.out.println("a + b = "+(a+b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a - b = "+(a-b));
    }
}
