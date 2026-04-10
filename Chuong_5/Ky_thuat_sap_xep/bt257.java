package bt_java_tienhq.Chuong_5.Ky_thuat_sap_xep;

import java.util.Scanner;

// Hãy sắp xếp các giá trị tại các vị trí lẻ trong mảng tăng dần các giá trị
// khác giữ nguyên giá trị và vị trí (vitriletang)
public class bt257 {
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
        for (double a : arr) {
            System.out.print(a + " ");
        }
        for (int i = 1; i < n - 1; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("ketqua là : ");
        for (double a : arr) {
            System.out.print(a + " ");
        }
        sc.close();
    }
}
