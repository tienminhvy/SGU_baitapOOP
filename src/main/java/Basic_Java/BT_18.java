package Basic_Java;
import java.util.*;
/**
 *
 * @author tienm
 */
public class BT_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = sc.nextInt();
        if (isFibo(x))
            System.out.println("x la so Fibonaxi");
        else
            System.out.println("x khong phai la so Fibonaxi");
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        printNFibo(n);
        System.out.print("Nhap m: ");
        int m = sc.nextInt();
        System.out.print("Tong cac so Fibonaxi be hon m: "+sumFiboSmallerThan(m));
    }
    
    public static boolean isFibo(int n) {
        if (n<=0) return false;
        if (n==1 || n==2) return true;
        int i = 3;
        while(true) {
            if (Fibo(i++) == n)
                return true;
            if (Fibo(i)>n)
                break;
        }
        return false;
    }
    
    public static int Fibo(int n) {
        if (n<=0) return 0;
        if (n==1 || n==2) return 1;
        return Fibo(n-1)+Fibo(n-2);
    }
    
    public static void printNFibo(int n) {
        System.out.println("N so Fibonaxi dau tien: ");
        for(int i=1;i<=n;i++)
            System.out.print(Fibo(i)+" ");
        System.out.println();
    }
    
    public static int sumFiboSmallerThan(int m) {
        if (m<1) return 0;
        int s = 0;
        int i=1;
        while(true) {
            if (Fibo(i) < m) s+=Fibo(i++);
            else break;
        }
        return s;
    }
}
