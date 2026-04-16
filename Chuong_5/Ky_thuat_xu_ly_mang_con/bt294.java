package bt_java_tienhq.Chuong_5.Ky_thuat_xu_ly_mang_con;

// Liệt kê tất cả các mảng con có độ dài lớn hơn 2 trong mảng một chiều 
//các số nguyên (conlonhonhai).
import java.util.Scanner;

public class bt294 {
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
        System.out.println("\nCác mảng con của mảng ban đầu là : ");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if ((j - i + 1) > 2) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
