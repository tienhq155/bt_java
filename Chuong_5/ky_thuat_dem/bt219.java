package bt_java_tienhq.Chuong_5.ky_thuat_dem;
//Đếm số lần xuất hiện của giá trị x trong mảng một chiều các số thực (tanxuat).

import java.util.Scanner;

public class bt219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double a : arr) {
            System.out.print(a + " ");
        }
        System.out.print("\nNhập x : ");
        int x = sc.nextInt();
        int tanxuat = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                tanxuat++;
            }
        }
        System.out.print("\nKết quả là : " + tanxuat);
        sc.close();
    }
}
