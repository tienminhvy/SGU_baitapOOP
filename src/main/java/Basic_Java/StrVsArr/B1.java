package Basic_Java.StrVsArr;
import java.util.*;
/**
 *
 * @author tienm
 */
public class B1 {
    static Scanner sc = new Scanner(System.in);
    
    static int[] nhapMang() {
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++) {
            System.out.print("arr["+i+"] = ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        return arr;
    }
    
    static void xuatMang(int []arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    static int max(int []arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (max<arr[i]) max = arr[i];
        }
        return max;
    }
    
    static void timTatCaMax(int []arr) {
        int max = max(arr);
        System.out.print("Vi tri cac phan tu lon nhat: ");
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == max) System.out.print(i+" ");
        }
        System.out.println();
    }
    
    static int _2ndMax(int []arr) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (max < arr[i]) max = arr[i];
            if (max2 < arr[i] && max != arr[i]) max2 = arr[i];
        }
        return max2;
    }
    
    static void timMax2ndCuoiCung(int []arr) {
        int max2nd = _2ndMax(arr);
        int index = -1;
        for(int i=0;i<arr.length;i++) {
            if (max2nd == arr[i]) index = i;
        }
        System.out.println("Vi tri cuoi cung dat gia tri lon thu hai la: "+index);
    }
    
    static int[] ascSort(int []arr) {
        int t = 0;
        int [] arrAsc = Arrays.copyOf(arr, arr.length);
        for(int i=0;i<arrAsc.length-1;i++)
            for(int j=i+1;j<arrAsc.length;j++)
                if (arrAsc[i] > arrAsc[j]) {
                    t = arrAsc[i];
                    arrAsc[i] = arrAsc[j];
                    arrAsc[j] = t;
                }
        return arrAsc;
    }
    
    static int[] descSort(int []arr) {
        int t = 0;
        int [] arrDesc = Arrays.copyOf(arr, arr.length);
        for(int i=0;i<arrDesc.length-1;i++)
            for(int j=i+1;j<arrDesc.length;j++)
                if (arrDesc[i] < arrDesc[j]) {
                    t = arrDesc[i];
                    arrDesc[i] = arrDesc[j];
                    arrDesc[j] = t;
                }
        return arrDesc;
    }
    
    static int[] themPTVaoCuoi(int []arr) {
        System.out.print("Nhap phan tu ban muon them vao: ");
        int n = Integer.parseInt(sc.nextLine());
        int [] arrTemp = Arrays.copyOf(arr, arr.length+1);
        arrTemp[arr.length] = n;
        return arrTemp;
    }
    
    static int[] themPTVaoVTk(int []arr) {
        System.out.print("Nhap phan tu ban muon them vao: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap vi tri k ma ban muon them phan tu: ");
        int k = Integer.parseInt(sc.nextLine());
        int [] arrTemp = Arrays.copyOf(arr, arr.length+1);
        
        while (k<0 || k >= arrTemp.length) {
            System.out.print("k phai nam trong khoang [0..arr.length], vui long nhap lai: ");
            k = Integer.parseInt(sc.nextLine());
        }
        if (k!=arrTemp.length-1) {
            for(int i=arrTemp.length-1;i>k;i--)
                arrTemp[i] = arrTemp[i-1];
        }
        arrTemp[k] = n;
        
        return arrTemp;
    }
    
    static int[] loaiBoPTCuoi(int []arr) {
        int [] arrTemp = Arrays.copyOf(arr, arr.length-1);
        return arrTemp;
    }
    
    static int[] loaiBoPTVTk(int []arr) {
        System.out.print("Nhap vi tri k ma ban muon loai bo phan tu: ");
        int k = Integer.parseInt(sc.nextLine());
        int [] arrTemp = Arrays.copyOf(arr, arr.length);
        
        while (k<0 || k >= arrTemp.length) {
            System.out.print("k phai nam trong khoang [0..arr.length], vui long nhap lai: ");
            k = Integer.parseInt(sc.nextLine());
        }
        if (k!=arrTemp.length-1) {
            // 7 4 5 1 2 3 6 9
            //       x
            // 7 4 5 2 2 3 6 9
            // 7 4 5 2 3 3 6 9
            // 7 4 5 2 3 6 6 9
            // 7 4 5 2 3 6 9 9
            for(int i=k;i<arrTemp.length-1;i++) {
                arrTemp[i] = arrTemp[i+1];
            }
        }
        arrTemp = Arrays.copyOf(arrTemp, arrTemp.length-1);
        
        return arrTemp;
    }
    
    static int tongCacSoChuSoDauLe(int []arr) {
        String s = "";
        int chuSoDau = 0, sum = 0;
        for(int i=0; i<arr.length;i++) {
            s = arr[i]+"";
            chuSoDau = Integer.parseInt(s.charAt(0)+"");
            if (chuSoDau % 2 != 0) sum+=arr[i];
        }
        return sum;
    }
    
    static int min2nd(int []arr) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (min > arr[i]) min = arr[i];
            if (min2 > arr[i] && arr[i] != min) min2 = arr[i];
        }
        return min2;
    }
    
    static void timSoTrungX(int []arr) {
        System.out.print("Nhap x co 2 chu so: ");
        int x = sc.nextInt();
        boolean timThay;
        while((x+"").length() != 2) {
            System.out.print("Vui long nhap x co 2 chu so: ");
            x = sc.nextInt();
        }
        System.out.print("Cac phan tu thoa man: ");
        int count;
        for(int i=0;i<arr.length;i++) {
            timThay = false;
            count = 0;
            for(int j=0;j<(arr[i]+"").length();j++) {
                for(int k=0;k<(x+"").length();k++) {
                    if ((arr[i]+"").charAt(j) == (x+"").charAt(k))
                    {
                        count++;
                        break;
                    }
                }
                
                if (count>1) timThay = true;
            }
            if (timThay) System.out.print(arr[i] + " ");
        }
    }
    
    public static void sortEvenOnlyASC(int []arr) {
        int t;
        for(int i=0;i<arr.length-1;i++)
            for(int j=i+1;j<arr.length;j++)
                if (arr[i]%2==0 && arr[j]%2==0) {
                    if (arr[i] > arr[j]) {
                        t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
                }
    }
    
    public static void main(String[] args) {
        int arr[] = nhapMang();
//        xuatMang(arr);
//        timTatCaMax(arr);
//        timMax2ndCuoiCung(arr);
//        int arrAsc[] = ascSort(arr);
//        int arrDesc[] = descSort(arr);
//        xuatMang(arrAsc);
//        xuatMang(arrDesc);
//        int []arrManipulated = themPTVaoCuoi(arr);
//        xuatMang(arrManipulated);
//        int []arrManipulated = themPTVaoVTk(arr);
//        xuatMang(arrManipulated);
//        int []arrManipulated = loaiBoPTCuoi(arr);
//        xuatMang(arrManipulated);
//        int []arrManipulated = loaiBoPTVTk(arr);
//        xuatMang(arrManipulated);
//        System.out.println("Tong cac chu so dau la so le la: "+tongCacSoChuSoDauLe(arr));
//        System.out.println("Gia tri nho thu hai cua mang la: "+min2nd(arr));
//        timSoTrungX(arr);
        sortEvenOnlyASC(arr);
    }
}
