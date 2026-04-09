package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

import java.util.Scanner;

// Cho mảng một chiều các số thực, hãy tìm đoạn [a,b] sao cho đoạn này 
// chứa tất cả các giá trị trong mảng (timdoan)
public class bt157 {
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
        double min = arr[0];
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("\nĐoạn [a,b] chứa tất cả các giá trị trong mảng là : [" + min + "," + max + "]");
        sc.close();
    }
}
