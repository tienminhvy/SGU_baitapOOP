package ClassVsObj;
import java.util.Scanner;

public class TamGiac {
    private int a,b,c;
    static Scanner sc = new Scanner(System.in);

    public TamGiac() {
    }

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public void nhap() {
        System.out.print("Nhap a,b,c: ");
        this.setA(sc.nextInt());
        this.setB(sc.nextInt());
        this.setC(sc.nextInt());
    }
    
    public int chuVi() {
        return this.a+this.b+this.c;
    }
    
    public double dienTich() {
        double p = (this.a+this.b+this.c)/2.0;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }
    
    public static void main(String[] args) {
        TamGiac tg = new TamGiac(5,6,7);
        System.out.println("Tam giac co ba canh a: "+tg.a+", b: "+tg.b+", c: "+tg.c);
        tg.nhap();
        System.out.println("Tam giac co ba canh a: "+tg.a+", b: "+tg.b+", c: "+tg.c);
    }
}
