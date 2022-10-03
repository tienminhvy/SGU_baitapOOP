package Basic_Java;
import java.util.*;
/**
 *
 * @author tienm
 */
public class BT_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            if (n%2==0)
                s += (i%2==0) ? i : 0;
            else
                s += (i%2==0) ? 0 : i;
        }
        System.out.print("Ket qua s = "+s);
    }
}
