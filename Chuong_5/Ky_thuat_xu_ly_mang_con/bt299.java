package bt_java_tienhq.Chuong_5.Ky_thuat_xu_ly_mang_con;

import java.util.Scanner;

// Liệt kê các dãy con toàn dương có độ dài lớn hơn 1 trong mảng một 
//chiều số thực (lietkeconduong)
public class bt299 {
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
        System.out.println("\nCác mảng con của mảng ban đầu là : ");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                boolean check = true;
                if (j - i + 1 > 1) {
                    for (int k = i; k <= j; k++) {
                        if (arr[k] <= 0) {
                            check = false;
                            break;
                        }
                    }
                    if (check == true) {
                        for (int k = i; k <= j; k++) {
                            System.out.print(arr[k] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
        sc.close();
    }
}
