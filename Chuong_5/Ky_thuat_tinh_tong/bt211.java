package bt_java_tienhq.Chuong_5.Ky_thuat_tinh_tong;

import java.util.Scanner;

// Tính trung bình cộng các số nguyên tố trong mảng một chiều các số 
// nguyên (tbnguyento). 
public class bt211 {
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
        int tbnguyento = 0;
        int dem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                tbnguyento += arr[i];
                dem++;
            }
            if (dem > 0) {
                tbnguyento /= dem;
            } else {
                tbnguyento = 0;
            }
            System.out.print("\nKết quả là : " + tbnguyento);
        }
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
