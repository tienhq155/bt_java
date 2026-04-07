package bt_java_tienhq.Chuong_5.ky_thuat_xuat_nhap_mang;

// Viết hàm liệt kê các giá trị chẵn trong mảng một chiều các số nguyên
import java.util.Scanner;

public class bt132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập số lượng phần tử : ");

        long[] arr = new long[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextLong();
        }
        System.out.print("Các số chẵn trong mảng là : ");
        for (long x : arr) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
    }
}
