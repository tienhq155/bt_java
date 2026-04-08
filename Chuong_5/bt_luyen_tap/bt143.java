package bt_java_tienhq.Chuong_5.bt_luyen_tap;

import java.util.Scanner;

// Viết hàm tìm “số chẵn đầu tiên” trong mảng các số nguyên (chandau).
// Nếu mảng không có giá trị chẵn thì hàm sẽ trả về giá trị không chẵn là -
// 1.
public class bt143 {
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
        for (int x : arr) {
            System.out.print(x + " ");
        }
        int chandau = -1;
        for (int x : arr) {
            if (x % 2 == 0) {
                chandau = x;
                break;
            }
        }
        if (chandau == -1) {
            System.out.print("\nSố chẵn đầu tiên trong mảng là -1");
        } else {
            System.out.print("\nSố chẵn đầu tiên trong mảng là " + chandau);
        }
        sc.close();
    }
}
