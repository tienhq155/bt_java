package bt_java_tienhq.Chuong_5.Ky_thuat_su_ly_mang;

import java.util.Scanner;

public class bt288 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_WHITE = "\u001B[37m";

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
        System.out.print("\nMảng mới là : ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(ANSI_YELLOW + arr[i]);
            } else {
                System.out.print(ANSI_WHITE + arr[i]);
            }
        }
        System.out.println();
        sc.close();
    }

}
