package bt_java_tienhq.Chuong_5.Ky_thuat_xu_ly_mang_con;

import java.util.Scanner;

// . Cho hai mảng a và b. Hãy đếm số lần xuất hiện của mảng a trong mảng 
// b. (demmangcon).
public class bt302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        int an = sc.nextInt();
        int[] arr = new int[an];

        for (int i = 0; i < an; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảng Vừa Nhập Là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        int bn = sc.nextInt();
        int[] brr = new int[bn];

        for (int i = 0; i < bn; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            brr[i] = sc.nextInt();
        }
        System.out.print("Mảng Vừa Nhập Là : ");
        for (int x : brr) {
            System.out.print(x + " ");
        }

        int dem = 0;
        if (an <= bn) {
            for (int i = 0; i <= bn - an; i++) {
                boolean chung = true;
                for (int j = 0; j < an; j++) {
                    if (arr[j] != brr[i + j]) {
                        chung = false;
                        break;
                    }
                }
                if (chung == true) {
                    dem++;
                }
            }
        }
        if (dem > 0) {
            System.out.print("Số lần xuất hiện là : " + dem);
        } else {
            System.out.print(" không là tập con của nhau ");
        }

        sc.close();
    }
}
