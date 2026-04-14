package bt_java_tienhq.Chuong_5.Ky_thuat_sap_xep;

import java.util.Scanner;

// Hãy sắp xếp các số hoàn thiện trong mảng giảm dần các giá trị khác giữ 
//nguyên giá trị và vị trí (nguyentotang). 
public class bt259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (isPerfect(arr[i])) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (isPerfect(arr[j]) && arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.print("Mảnh mới Là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static boolean isPerfect(int n) {
        if (n < 6) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
