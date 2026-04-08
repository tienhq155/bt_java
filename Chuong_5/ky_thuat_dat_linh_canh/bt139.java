// Tìm “vị trí số hoàn thiện cuối cùng” trong mảng một chiều các số
// nguyên (vitrihoanthiencuoi). Nếu mảng không có số hoàn thiện thì trả
// về giá trị - 1.
package bt_java_tienhq.Chuong_5.ky_thuat_dat_linh_canh;

import java.util.Scanner;

public class bt139 {
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
        int vitrihoanthiencuoi = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (isPerfect(arr[i])) {
                vitrihoanthiencuoi = i;
                break;
            }
        }
        if (vitrihoanthiencuoi == -1) {
            System.out.print("\nVị trí của số hoàn thiện cuối cùng trong mảng là -1 ");
        } else {
            System.out.print("\nVị trí của số hoàn thiện cuối cùng trong mảng là " + (vitrihoanthiencuoi + 1));
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