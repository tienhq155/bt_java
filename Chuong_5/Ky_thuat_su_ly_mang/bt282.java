package bt_java_tienhq.Chuong_5.Ky_thuat_su_ly_mang;

// Hãy đưa các số chia hết cho 3 về đầu mảng (chiahetchoba). 
import java.util.Scanner;

public class bt282 {
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
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                int temp = arr[i];

                for (int j = i; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        }
        System.out.print("Mảng mới là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
