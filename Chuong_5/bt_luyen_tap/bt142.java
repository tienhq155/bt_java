package bt_java_tienhq.Chuong_5.bt_luyen_tap;

import java.util.Scanner;

//Tìm “giá trị nhỏ nhất” trong mảng một chiều số thực (nhonhat).
public class bt142 {
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
        int nhonhat = arr[0];
        for (int x : arr) {
            if (x < nhonhat) {
                nhonhat = x;
            }
        }
        System.out.print("\n Giá trị nhỏ nhất trong mảng là " + nhonhat);
        sc.close();
    }

}
