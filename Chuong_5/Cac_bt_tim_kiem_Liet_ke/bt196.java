package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

import java.util.Scanner;

//Hãy liệt kê các số âm trong mảng một chiều các số thực (lietkeam)
public class bt196 {
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
        int lietkeam = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                lietkeam = arr[i];
                System.out.print(lietkeam + " ");
            }
        }
    }
}
