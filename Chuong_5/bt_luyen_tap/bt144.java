package bt_java_tienhq.Chuong_5.bt_luyen_tap;

// Tìm “số nguyên tố đầu tiên” trong mảng một chiều các số nguyên
// (nguyentodau). Nếu mảng không có số nguyên tố thì trả về giá trị -1.
import java.util.Scanner;

public class bt144 {
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
        int nguyentodau = -1;
        for (int x : arr) {
            if (isPrime(nguyentodau)) {
                nguyentodau = x;
                break;
            }
        }
        if (nguyentodau == -1) {
            System.out.print("\nSố nguyên tố đầu tiên trong mảng là -1");
        } else {
            System.out.print("\nSố nguyên tố đầu tiên trong mảng là " + nguyentodau);
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}