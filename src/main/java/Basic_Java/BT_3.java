package Basic_Java;


import java.util.Scanner;

public class BT_3 {
    public static void main(String[] args) {
        String hoTen, queQuan;
        byte dtoan, dly, dhoa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem toan: ");
        dtoan = Byte.parseByte(sc.nextLine());
        System.out.print("Nhap diem ly: ");
        dly = Byte.parseByte(sc.nextLine());
        System.out.print("Nhap diem hoa: ");
        dhoa = Byte.parseByte(sc.nextLine());
        System.out.print("Nhap que quan: ");
        queQuan = sc.nextLine();
        
        System.out.println("Thong tin da nhap: ");
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Diem toan: "+dtoan);
        System.out.println("Diem ly: "+dly);
        System.out.println("Diem hoa: "+dhoa);
        System.out.println("Que quan: "+queQuan);
        
        System.out.println("Diem trung binh: "+((dtoan+dly+dhoa)/3.0));
    }
}
