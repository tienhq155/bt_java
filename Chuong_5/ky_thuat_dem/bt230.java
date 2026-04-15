package bt_java_tienhq.Chuong_5.ky_thuat_dem;
// Hãy liệt kê tần suất xuất hiện của các giá trị xuất hiện trong mảng 

import java.util.Scanner;

//(lietke). (Lưu ý: mỗi giá trị liệt kê một lần). 

public class bt230 {
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
        sc.close();
    }
}
