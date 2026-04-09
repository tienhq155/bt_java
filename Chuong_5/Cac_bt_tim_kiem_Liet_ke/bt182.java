package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

import java.util.Scanner;
// Cho mảng một chiều các số thực. Hãy viết hàm liệt kê tất cả các giá trị
// trong mảng có ít nhất một lân cận trái dấu với nó.

public class bt182 {
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
        for (int a : arr) {
            System.out.print(a + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            boolean traiDau = (i > 0 && arr[i] * arr[i - 1] < 0) || (i < arr.length - 1 && arr[i] * arr[i + 1] < 0);
            if (traiDau) {
                System.out.print("\n kết quả là : " + arr[i]);
            }
        }
        sc.close();
    }
}
