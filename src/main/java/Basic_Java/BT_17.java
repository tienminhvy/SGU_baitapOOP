package Basic_Java;
import java.util.*;
/**
 *
 * @author tienm
 */
public class BT_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a,b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("BCNN cua hai so la: "+((a*b)/USCLN(a,b)));
    }
    
    public static int USCLN(int a, int b) {
        if (b==0) return a;
        return USCLN(b,a%b);
    }
}
