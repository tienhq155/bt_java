package bt_java_tienhq.Chuong_5.bt_luyen_tap;

import java.util.Scanner;

// Hãy tìm “giá trị chẵn nhỏ nhất” trong mảng một chiều các số nguyên
// (channhonhat). Nếu mảng không có giá trị chẵn thì trả về giá trị không
// chẵn là -1.
public class bt153 {
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
        int channhonhat = -1;
        for (int x : arr) {
            if (x % 2 == 0) {
                if (channhonhat == -1 || x < channhonhat) {
                    channhonhat = x;
                }
            }
        }
        if (channhonhat == -1) {
            System.out.print("\nSố chẵn nhỏ nhất trong mảng là -1");
        } else {
            System.out.print("\nSố chẵn nhỏ nhất trong mảng là " + channhonhat);
        }
        sc.close();
    }
}
