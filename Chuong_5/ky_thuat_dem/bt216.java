package bt_java_tienhq.Chuong_5.ky_thuat_dem;

import java.util.Scanner;

// Đếm số lượng số chẵn có trong mảng một chiều các số nguyên
// (demchan).

public class bt216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double a : arr) {
            System.out.print(a + " ");
        }
        int demchan = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                demchan++;
            }
        }
        System.out.print("\nkết quả là : " + demchan);
        sc.close();
    }
}
