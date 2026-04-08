package bt_java_tienhq.Chuong_5.ky_thuat_dat_linh_canh;

import java.util.Scanner;

// Hãy tìm “giá trị dương nhỏ nhất” trong mảng các số thực
// (duongnhonhat). Nếu mảng không có giá trị dương thì trả về giá trị
// không dương là – 1
public class bt140 {
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
        int duongnhonhat = -1;
        for (int x : arr) {
            if (x > 0) {
                if (duongnhonhat == -1 || x < duongnhonhat) {
                    duongnhonhat = x;
                }
            }
        }
        if (duongnhonhat == -1) {
            System.out.print("\nGiá trị dương nhỏ nhất trong mảng là -1 ");
        } else {
            System.out.print("\nGiá trị dương nhỏ nhất trong mảng là " + duongnhonhat);
        }

        sc.close();
    }
}
