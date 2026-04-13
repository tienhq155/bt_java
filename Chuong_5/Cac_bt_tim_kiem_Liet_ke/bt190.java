package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

import java.util.Scanner;

// Hãy liệt kê các giá trị có toàn chữ số lẻ trong mảng một chiều các số
// nguyên.
public class bt190 {
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
        for (int a : arr) {
            System.out.print(a + " ");
        }
        boolean kiemtra = false;
        System.out.print("\nKết quả là : ");
        for (int x : arr) {
            if (ischeck(x)) {
                System.out.print(x + " ");
                kiemtra = true;
            }
        }
        sc.close();
    }

    public static boolean ischeck(int n) {
        int temp = Math.abs(n);
        if (temp == 0) {
            return false;
        }
        while (temp > 0) {
            int check = temp % 10;
            if (check % 2 == 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}