package bt_java_tienhq.Chuong_5.Ky_thuat_xoa;

import java.util.Scanner;

// Hãy xóa tất cả các số lớn nhất trong mảng các số thực (xoalonnhat)
public class bt272 {

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

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                i--;
                n--;
            }

        }
        System.out.print("kết quả là : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}