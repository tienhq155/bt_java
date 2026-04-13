package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;
// Cho mảng số thực có nhiều hơn ba giá trị và các giá trị trong mảng

// khác nhau từng đôi một. Hãy liệt kê tất cả các bộ ba giá trị (a,b,c) thỏa
// điều kiện a = b + c với a, b, c là ba giá trị khác nhau trong mảng. Ví dụ:
// (6, 2, 4).

import java.util.Scanner;

public class bt195 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i != j && j != k && i != k) {
                        if (arr[i] == arr[j] + arr[k]) {
                            System.out.println(" " + arr[i] + " " + " " + arr[j] + " " + " " + arr[k]);
                        }
                    }
                }
            }
        }
    }
}
