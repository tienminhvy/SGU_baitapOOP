import java.util.*;

public class B1_139 {
    public static void main(String[] args) {
        System.out.print("Vui long nhap n: ");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println("Ket qua cau a: "+cauA(n));
        System.out.println("Ket qua cau b: "+cauB(n));
        System.out.println("Ket qua cau c: "+cauC(n));
        
    }
    
    public static int cauA(int n) {
        int s = 0;
        for(int i=1;i<=n;i++) {
            s+=Math.pow(i, 2);
        }
        return s;
    }
    public static double cauB(int n) {
        double s = 0;
        for(int i=1;i<=n;i++) {
            s+=1/(double)i;
        }
        return s;
    }
    public static double cauC(int n) {
        double s = 0;
        for(int i=1;i<=n;i++) {
            s+=1/(double) giaiThua(n);
        }
        return s;
    }
    public static int giaiThua(int n) {
        if (n<=0) return 1;
        return n*giaiThua(n-1);
    }
}
