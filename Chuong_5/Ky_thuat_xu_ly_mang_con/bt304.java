package bt_java_tienhq.Chuong_5.Ky_thuat_xu_ly_mang_con;

import java.util.Scanner;

//Cho mảng một chiều các số nguyên và một số nguyên M. Hãy tìm 
//một mảng con sao cho tổng các phần tử trong mảng bằng M
public class bt304 {
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
        System.out.print("\nNhập M : ");
        int M = sc.nextInt();
        // int summax = -1;
        int diemdau = -1;
        int diemcuoi = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                boolean check = true;
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (check == true) {
                    if (sum == M) {
                        diemdau = i;
                        diemcuoi = j;
                        break;
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
