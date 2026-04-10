package bt_java_tienhq.Chuong_5.ky_thuat_dem;

import java.util.Scanner;

// Đếm số lượng giá trị dương chia hết cho 7 trong mảng một chiều các số
// nguyên (demchiahetbay).
public class bt217 {
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
        int demchiahetbay = 0;
        for (int x : arr) {
            if (x > 0 && x % 7 == 0) {
                demchiahetbay++;
            }
        }
        System.out.print("\nKết quả là : " + demchiahetbay);
        sc.close();
    }
}
