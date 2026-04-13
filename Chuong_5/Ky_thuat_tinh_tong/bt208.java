package bt_java_tienhq.Chuong_5.Ky_thuat_tinh_tong;

import java.util.Scanner;

// Tính tổng các giá trị chính phương trong mảng một chiều các số
// nguyên (tongchinhphuong).
public class bt208 {
    public static void main(String[] arger) {
        Scanner sc = new Scanner(System.in);{
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
        int tongchinhphuong = 0;
        for (int a : arr){
            if (perfectSquare(a)){
                tongchinhphuong += a;
            }
        }
        System.out.print("\nKết quả là : " + tongchinhphuong);
        sc.close();
        }
    }

    public static boolean perfectSquare(int n) {
        if (n < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
