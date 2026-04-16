package bt_java_tienhq.Chuong_5.Ky_thuat_xu_ly_mang_con;

import java.util.Scanner;

public class bt301 {
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

        boolean check = false;
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
                    check = true;
                    break;
                }
            }
        }
        if (check == true) {
            System.out.print(" có là tập con của nhau ");
        } else {
            System.out.print(" không là tập con của nhau ");
        }
        sc.close();
    }
}
