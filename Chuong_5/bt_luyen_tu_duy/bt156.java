package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

import java.util.Scanner;

// Hãy tìm một vị trí trong mảng một chiều các số thực mà giá trị tại vị trí
// đó là giá trị “gần giá trị x nhất”.
public class bt156 {
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
        System.out.print("\nNhập giá trị x: ");
        int x = sc.nextInt();

        int gannhat = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - x) < Math.abs(gannhat - x)) {
                gannhat = arr[i];
            }
        }
        System.out.print("\nGía trị gần x nhất trong mảng là : " + gannhat);
        sc.close();
    }
}
