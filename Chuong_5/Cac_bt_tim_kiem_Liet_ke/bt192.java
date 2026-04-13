package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

import java.util.Scanner;

// Hãy liệt kê các giá trị trong mảng một chiều các số nguyên có chữ số
// đầu tiền là chữ số chẵn (liekedauchan).
public class bt192 {
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
        System.out.print("\nkết quả là : ");
        boolean kiemtra = false;
        for (int x : arr) {
            if (/* check.isPrime(x) && */ check.sodautien(x) % 2 == 0) {
                System.out.print(x + " ");
                kiemtra = true;
            }
        }
        if (!kiemtra) {
            System.out.print("\nKhông có số nguyên nào thỏa mãn điều kiện.");
        }
        sc.close();
    }

    public static class check {
        // public static boolean isPrime(long n) {
        // if (n < 2) {
        // return false;
        // }
        // for (int i = 2; i <= Math.sqrt(n); i++) {
        // if (n % i == 0) {
        // return false;
        // }
        // }
        // return true;
        // }

        public static int sodautien(int n) {
            int temp = Math.abs(n);
            while (temp >= 10) {
                temp /= 10;
            }
            return temp;
        }
    }
}
