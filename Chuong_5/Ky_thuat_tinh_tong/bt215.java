package bt_java_tienhq.Chuong_5.Ky_thuat_tinh_tong;

import java.util.Scanner;

//Tính khoảng cách trung bình giữa các giá trị trong mảng 
//(khoangcachtb). 
public class bt215 {
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
        int khoangcachtb = 0;
        int dem = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            {
                khoangcachtb += Math.abs(arr[i] - arr[i + 1]);
                dem++;
            }
        }
        if (dem > 0) {
            khoangcachtb /= dem;
        }
        System.out.print("\nKết Quả là : " + khoangcachtb);
        sc.close();
    }
}
