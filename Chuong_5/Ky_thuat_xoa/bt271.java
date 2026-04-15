package bt_java_tienhq.Chuong_5.Ky_thuat_xoa;

// Xóa các phần tử có chỉ số k trong mảng (xoavitri).
import java.util.Scanner;

// Xóa các phần tử có chỉ số k trong mảng (xoavitri).
public class bt271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.print("Nhập Vị trí cần xóa : ");
        int k = sc.nextInt();
        if (k < 0 || k >= n) {
            System.out.print("lỗi");
        } else {
            for (int i = k; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }
        System.out.print("kết quả là : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
