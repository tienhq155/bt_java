package bt_java_tienhq.Chuong_5.ky_thuat_dem;

// Hãy đếm số lượng “số hoàn thiện” có trong mảng một chiều các số 
// thực (demhoanthien)
import java.util.Scanner;

public class bt224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        int demhoanthien = 0;
        for (int a : arr) {
            if (isPerfect(a)) {
                demhoanthien++;
            }
        }
        System.out.print("\nKết quả là : " + demhoanthien);
        sc.close();
    }

    public static boolean isPerfect(int n) {
        if (n < 6) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
