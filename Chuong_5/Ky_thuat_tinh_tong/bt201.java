package bt_java_tienhq.Chuong_5.Ky_thuat_tinh_tong;

import java.util.Scanner;

//Tính tổng các giá trị dương trong mảng một chiều các số thực (tongduong).
public class bt201 {
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
        for (double a : arr) {
            System.out.print(a + " ");
        }
        int tongduong = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                tongduong += arr[i];
            }
        }
        System.out.print("\nKết quả là : " + tongduong);
        sc.close();
    }
}
