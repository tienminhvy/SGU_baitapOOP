import java.util.Scanner;

public class Cau03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        byte tuoi = Byte.parseByte(sc.nextLine());
        System.out.print("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.print("Nhap diem so: ");
        byte diemSo = sc.nextByte();
        System.out.println("Thong tin da nhap: ");
        System.out.println("Ten: "+ten+"\nTuoi: "+tuoi+"\nDia chi: "+diaChi+"\nDiem: "+diemSo);
    }
}
