package Basic_Java;
import java.util.*;
/**
 *
 * @author tienm
 */
public class BT_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        
    }
    
    public static boolean soNguyenTo(int n) {
        if (n<2) return false;
        for (int i=2;i<=Math.sqrt(n);i++) 
            if (n%i==0) return false;
        return true;
    }
    
    public static void phanTich(int n) {
        int i = 2;
        while(true) {
            
        }
    }
}
