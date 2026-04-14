package bt_java_tienhq.Chuong_5.Ky_thuat_tinh_tong;

import java.util.Scanner;

//  Tính trung bình cộng các số dương trong mảng một chiều các số thực 
// (trungbinhcong). 
public class bt212 {
    public static void main(String[] arger) {
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

        int trungbinhcong = 0;
        int dem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                trungbinhcong += arr[i];
                dem++;
            }

        }
        if (dem > 0) {
            trungbinhcong /= dem;
        }
        System.out.print("\nKết quả là : " + trungbinhcong);
        sc.close();
    }
}
