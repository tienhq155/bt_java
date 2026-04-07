package bt_java_tienhq.Chuong_5.ky_thuat_xuat_nhap_mang;

// Viết hàm nhập,xuất mảng một chiều các số nguyên.
import java.util.Scanner;

public class bt129_131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        long[] arr = new long[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextLong();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (long x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }

}
