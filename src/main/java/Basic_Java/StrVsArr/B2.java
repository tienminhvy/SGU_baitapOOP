/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basic_Java.StrVsArr;
import java.util.Scanner;
/**
 *
 * @author tienm
 */
public class B2 {
    static Scanner sc = new Scanner(System.in);
    
    public void nhapMang(int arr[][]) {
        int m,n;
        System.out.print("Nhap so dong: ");
        m = sc.nextInt();
        System.out.print("Nhap so cot: ");
        n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    
    public void xuatMang(int arr[][]) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    
//    public void sxTangDanTheoHang(int arr[][]) {
//        
//    }
    
    public static void main(String[] args) {
        
    }
}
