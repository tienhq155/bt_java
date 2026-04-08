// Tìm “số hoàn thiện đầu tiên” trong mảng một chiều các số nguyên
// (hoanthiendau). Nếu mảng không có số hoàn thiện thì trả về giá trị -1.
package bt_java_tienhq.Chuong_5.bt_luyen_tap;

import java.util.Scanner;

public class bt145 {
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
        int hoanthiendau = -1;
        for (int i = 0; i < arr.length; i++) {
            if (isPerfect(arr[i])) {
                hoanthiendau = i;
                break;
            }
        }
        if (hoanthiendau == -1) {
            System.out.print("\nVị trí của số hoàn thiện đầu tiên trong mảng là -1 ");
        } else {
            System.out.print("\nVị trí của số hoàn thiện đầu tiên trong mảng là " + (hoanthiendau + 1));
        }

        sc.close();
    }

    public static boolean isPerfect(int n) {
        if (n < 6) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}