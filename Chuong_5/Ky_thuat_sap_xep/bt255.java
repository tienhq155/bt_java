package bt_java_tienhq.Chuong_5.Ky_thuat_sap_xep;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Hãy sắp xếp các giá trị trong mảng các số thực tăng dần (sapxeptang)
public class bt255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        int n = sc.nextInt();
        Double[] arr = new Double[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextDouble();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double a : arr) {
            System.out.print(a + " ");
        }
        Arrays.sort(arr);
        System.out.print("\nMảng tăng dần là : ");
        for (double a : arr) {
            System.out.print(a + " ");
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("\nMảng giảm dần là : ");
        for (double a : arr) {
            System.out.print(a + " ");
        }
    }
}
