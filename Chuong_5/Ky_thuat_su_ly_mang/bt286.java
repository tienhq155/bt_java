package bt_java_tienhq.Chuong_5.Ky_thuat_su_ly_mang;

import java.util.Scanner;

public class bt286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        if (n > 0) {
            int temp = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = temp;

        }
        System.out.print("Mảng mới là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
