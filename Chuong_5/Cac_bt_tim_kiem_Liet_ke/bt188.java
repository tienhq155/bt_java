package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

import java.util.Scanner;

// Hãy liệt kê các vị trí chẵn lớn nhất trong mảng một chiều các số nguyên
public class bt188 {
    public static void main(String[] arger) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double a : arr) {
            System.out.print(a + " ");
        }
        int max = -1;
        boolean Even = false;
        for (int x : arr) {
            if (x % 2 == 0) {
                if (!Even || x > max) {
                    max = x;
                    Even = true;
                }
            }
        }
        if (!Even) {
            System.out.print("\nKhông có giá trị chẵn trong mảng");

        } else {
            System.out.print("kết quả là : ");
            if (Even) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == max) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
        sc.close();
    }
}