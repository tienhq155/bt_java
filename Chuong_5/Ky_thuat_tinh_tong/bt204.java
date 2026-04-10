package bt_java_tienhq.Chuong_5.Ky_thuat_tinh_tong;

import java.util.Scanner;

// Tính tổng các giá trị lớn hơn giá trị đứng liền trước nó trong mảng một
// chiều các số thực
public class bt204 {
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
        sc.close();
    }
}
