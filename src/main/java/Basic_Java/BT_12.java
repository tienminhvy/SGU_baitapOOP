package Basic_Java;

public class BT_12 {
    public static void main(String[] args) {
        
        int s=0;
        for (int i = 1; i <= 100; i++) {
            if (i%7==0) s+=i;
        }
        System.out.print("Tong cac so la boi cua 7 la: "+s);
    }
}
