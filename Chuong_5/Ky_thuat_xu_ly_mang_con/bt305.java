package bt_java_tienhq.Chuong_5.Ky_thuat_xu_ly_mang_con;

import java.util.Scanner;

//Tìm dãy con toàn dương có tổng lớn nhất trong mảng một chiều các 
//số thực (duonglonnhat).
public class bt305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảng Vừa Nhập Là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        int summax = -1;
        int diemdau = -1;
        int diemcuoi = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                boolean check = true;
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    if (arr[k] < 0) {
                        check = false;
                        break;
                    }
                    sum += arr[k];
                }
                if (check == true) {
                    if (sum > summax) {
                        summax = sum;
                        diemdau = i;
                        diemcuoi = j;
                    }
                }
            }
        }
        if (diemdau != -1) {
            System.out.print("Mảng con có tổng lớn nhất là : ");
            for (int i = diemdau; i <= diemcuoi; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
