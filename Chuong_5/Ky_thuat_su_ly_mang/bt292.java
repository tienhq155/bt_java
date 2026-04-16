package bt_java_tienhq.Chuong_5.Ky_thuat_su_ly_mang;

import java.util.Scanner;

// Hãy biến đổi mảng bằng cách thay tất cả các phần tử trong mảng bằng 
// số nguyên gần nó nhất (nguyenhoa). 
public class bt292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextDouble();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double x : arr) {
            System.out.print(x + " ");
        }
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (arr[i] + 0.5);
        }
        System.out.print("Mảng mới là : ");
        for (double x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
