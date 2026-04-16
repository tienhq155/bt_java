package bt_java_tienhq.Chuong_5.Xay_dung_mang;

// Cho mảng một chiều các số nguyên a. Hãy tạo mảng b từ mảng a, sao 
//cho mảng b chỉ chứa các giá trị lẻ
import java.util.Scanner;

public class bt307 {
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
        System.out.println("mảng mới là : ");
        for (int i = 0; i < n; i++) {
            {
                if (arr[i] % 2 != 0) {
                    System.out.print(arr[i] + " ");
                }

            }
        }
        sc.close();
    }
}
