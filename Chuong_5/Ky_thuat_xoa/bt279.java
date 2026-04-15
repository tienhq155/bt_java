package bt_java_tienhq.Chuong_5.Ky_thuat_xoa;

import java.util.Scanner;

//  Hãy xóa tất cả các phần tử có tần suất xuất hiện trong mảng nhiều hơn 
// một lần (xoatrungtatcar).
public class bt279 {
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

        for (int i = 0; i < n; i++) {
            boolean check = false;
            for (int j = i; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    check = true;
                    break;
                }
            }
            if (check == true) {
                int xoa = arr[i];
                for (int j = 0; j < n; j++) {
                    if (arr[j] == xoa) {
                        for (int k = j; k < n - 1; k++) {
                            arr[k] = arr[k + 1];

                        }
                        j--;
                        n--;
                    }
                }
                i--;
            }
        }

        System.out.print("\nkết quả là : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}
