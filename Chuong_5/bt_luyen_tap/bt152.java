package bt_java_tienhq.Chuong_5.bt_luyen_tap;

import java.util.Scanner;

// Hãy tìm “hoàn thiện nhỏ nhất” trong mảng một chiều các số nguyên
// (hoanthiennhonhat). Nếu mảng không có số hoàn thiện thì trả về giá trị
// 0.
public class bt152 {
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
        int hoanthiennhonhat = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (isPerfect(arr[i])) {
                if (hoanthiennhonhat == 0 || arr[i] < hoanthiennhonhat) {
                    hoanthiennhonhat = arr[i];
                }
            }
        }
        if (hoanthiennhonhat == 0) {
            System.out.print("\nKhông có số hoàn thiện nào trong mảng ");
        } else {
            System.out.print("\nSố hoàn thiện nhỏ nhất trong mảng là " + hoanthiennhonhat);
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
