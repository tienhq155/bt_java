package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

import java.util.Scanner;

// Cho mảng số nguyên có nhiều hơn hai giá trị. Hãy liệt kê tất cả các cặp
// giá trị gần nhau nhất trong mảng (gannhaunhat).

public class bt194 {
    public static void main(String[] arger) {
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
        int gannhaunhat = Math.abs(arr[0] - arr[1]);
        for (int i = 1; i < arr.length - 1; i++) {
            int khoangcanh = Math.abs(arr[i] - arr[i + 1]);
            if (khoangcanh < gannhaunhat) {
                gannhaunhat = khoangcanh;
            }
        }
        System.out.print("\nkết quả là : ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) == gannhaunhat) {
                System.out.print(arr[i] + " " + arr[i + 1]);
            }
        }
    }
}
