package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

import java.util.Scanner;

// Hãy liệt kê các giá trị cực đại trong mảng một chiều các số thực. một
// phần tử được gọi là cực đại khi lớn hơn các phần tử lân cận.

public class bt191 {
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
        System.out.print("\nKết quả là : ");
        boolean kiemtra = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
                kiemtra = true;
            }
        }
        if (!kiemtra) {
            System.out.print("\nKhông có giá trị cực đại trong mảng.");
        }
        sc.close();
    }
}
