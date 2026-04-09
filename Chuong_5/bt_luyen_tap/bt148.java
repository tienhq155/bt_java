package bt_java_tienhq.Chuong_5.bt_luyen_tap;

import java.util.Scanner;

//Tìm “số nguyên tố cuối cùng” trong mảng một chiều các số nguyên
//(nguyentocuoi). Nếu mảng không có số nguyên tố thì trả về giá trị -1.
public class bt148 {
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
        int nguyentocuoi = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (isPrime(arr[i])) {
                nguyentocuoi = arr[i];
                break;
            }
        }
        if (nguyentocuoi == -1) {
            System.out.print("\nSố nguyên tố cuối cùng trong mảng là -1");
        } else {
            System.out.print("\nSố nguyên tố cuối cùng trong mảng là " + nguyentocuoi);
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
