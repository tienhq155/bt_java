package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

import java.util.Scanner;

// Hãy liệt kê các vị trí mà giá trị tại các vị trí đó bằng giá trị dương nhỏ
// nhất trong mảng một chiều các số thực.

public class bt187 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextDouble();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double a : arr) {
            System.out.print(a + " ");
        }
        double min = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (min == -1 || arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        if (min == -1) {
            System.out.print("\nKhông có giá trị dương trong mảng.");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) {
                    System.out.print("\n kết quả : " + i);
                }
            }
        }
        sc.close();
    }
}
