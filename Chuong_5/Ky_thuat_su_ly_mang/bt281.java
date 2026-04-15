package bt_java_tienhq.Chuong_5.Ky_thuat_su_ly_mang;

// Hãy đưa các số chẵn trong mảng về đầu mảng, số lẻ về cuối mảng  (chandaulecuoi). 
import java.util.Scanner;

public class bt281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                arr1[temp++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr1[temp++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0 && arr[i] != 0) {
                arr1[temp++] = arr[i];
            }

        }
        System.out.print("Mảng mới là : ");
        for (int x : arr1) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
