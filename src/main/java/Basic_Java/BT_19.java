package Basic_Java;
import java.util.*;
/**
 *
 * @author tienm
 */
public class BT_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        int n = sc.nextInt();
        if (soChinhPhuong(n)) System.out.println("So da nhap la so chinh phuong.");
        else System.out.println("So da nhap khong la so chinh phuong.");
    }
    
    public static boolean soChinhPhuong(int n) {
        if (n < 1) return false;
        int i = 1;
        while (Math.pow(i, 2) <= n) {
            if ((int)Math.pow(i,2) == n)
                return true;
            i++;
        }
        return false;
    }
}
