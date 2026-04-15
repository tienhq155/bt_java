package bt_java_tienhq.Chuong_5.Ky_thuat_su_ly_mang;

import java.util.Scanner;

// . Hãy đảo ngược thứ tự các số dương có trong mảng (daoduong). 
public class bt285 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] < 0) {
                i++;
            } else if (arr[j] < 0) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.print("Mảng mới là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
