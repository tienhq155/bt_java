package bt_java_tienhq.Chuong_5.ky_thuat_dem;

import java.util.Scanner;

// Hãy đếm số lượng các giá trị lớn nhất có trong mảng một chiều các số 
// thực (demlonnhat).
public class bt225 {
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
        int demlonnhat = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                demlonnhat++;
            }
        }
        System.out.print("kết quả là : " + demlonnhat);
        sc.close();
    }
}
