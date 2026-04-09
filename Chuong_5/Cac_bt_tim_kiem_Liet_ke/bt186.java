package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

// Hãy liệt kê các vị trí trong mảng một chiều các số thực mà giá trị tại vị
// trí đó bằng giá trị âm đầu tiên trong mảng.

import java.util.Scanner;

public class bt186 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextDouble();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double a : arr) {
            System.out.print(a + " ");
        }
        boolean hasNegative = false;
        double am = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                am = arr[i];
                hasNegative = true;
                break;
            }
        }
        if (!hasNegative) {
            System.out.print("\nKhông có giá trị âm trong mảng.");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == am) {
                    System.out.print("\n kết quả : " + i);
                }
            }
        }
        sc.close();
    }
}
