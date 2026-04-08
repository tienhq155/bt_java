package bt_java_tienhq.Chuong_5.bt_luyen_tap;

import java.util.Scanner;

// Hãy tìm “số nguyên tố lớn nhất” trong mảng một chiều các số nguyên
// (nguyentolonnhat). Nếu mảng không có số nguyên tố thì trả về giá trị 0.
public class bt151 {
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
        for (int x : arr) {
            System.out.print(x + " ");
        }
        int nguyentolonnhat = 0;
        for (int x : arr) {
            if (isPrime(x)) {
                if (nguyentolonnhat == 0 || x > nguyentolonnhat) {
                    nguyentolonnhat = x;
                }
            }
        }
        if (nguyentolonnhat == 0) {
            System.out.print("\nSố nguyên tố lớn nhất trong mảng là 0");
        } else {
            System.out.print("\nSố nguyên tố lớn nhất  trong mảng là " + nguyentolonnhat);
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }
}
