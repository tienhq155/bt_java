package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

import java.util.Scanner;

//Tìm số chính phương đầu tiên trong mảng một chiều các số nguyên
public class bt163 {
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
        for (int a : arr) {
            System.out.print(a + " ");
        }
        int chinhphuong = -1;
        for (int i = 0; i < arr.length; i++) {
            if (perfectSquare(arr[i])) {
                chinhphuong = arr[i];
                break;
            }
        }
        if (chinhphuong == -1) {
            System.out.print("\nKhông tồn tại số chính phương trong mảng.");
        } else {
            System.out.print("\nSố chính phương đầu tiên trong mảng là: " + chinhphuong);
        }
        sc.close();
    }

    public static boolean perfectSquare(int n) {
        if (n < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
