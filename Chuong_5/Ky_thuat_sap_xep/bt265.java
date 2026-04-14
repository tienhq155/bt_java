package bt_java_tienhq.Chuong_5.Ky_thuat_sap_xep;

import java.util.Scanner;

// Cho hai mảng tăng dần. Hãy trộn hai mảng lại thành một mảng được 
//sắp thứ tự giảm dần (trongiam). 
public class bt265 {
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
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.print("\nNhập số lượng phần tử Mảng B: ");

        int m = sc.nextInt();
        int[] brr = new int[m];
        for (int i = 0; i < brr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            brr[i] = sc.nextInt();
        }
        System.out.print("Mảnh B Vừa NHập Là : ");
        for (int x : brr) {
            System.out.print(x + " ");
        }
        for (int i = 0; i < brr.length - 1; i++) {

            for (int j = i + 1; j < brr.length; j++) {
                if (brr[i] > brr[j]) {
                    int temp = brr[i];
                    brr[i] = brr[j];
                    brr[j] = temp;
                }
            }

        }
        int[] crr = new int[arr.length + brr.length];
        int a = arr.length - 1, b = brr.length - 1, c = 0;
        while (a >= 0 && b >= 0) {
            if (arr[a] > brr[b]) {
                crr[c++] = arr[a--];

            } else {
                crr[c++] = brr[b--];

            }
        }
        while (a >= 0) {
            crr[c++] = arr[a--];

        }
        while (b >= 0) {
            crr[c++] = brr[b--];

        }
        System.out.print("Mảnh mới Là : ");
        for (int x : crr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
