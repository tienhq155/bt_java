package bt_java_tienhq.Chuong_5.bt_luyen_tap;
// Hãy tìm “giá trị âm lớn nhất” trong mảng các số thực (amlonnhat). Nếu

// mảng không có giá trị âm thì trả về giá trị 0.

import java.util.Scanner;

public class bt150 {
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
        int amlonnhat = 0;
        for (int x : arr) {
            if (x < 0) {
                if (amlonnhat == 0 || x > amlonnhat) {
                    amlonnhat = x;
                }
            }
        }
        System.out.print("\n Giá trị âm lớn nhất trong mảng là " + amlonnhat);
        sc.close();
    }
}
