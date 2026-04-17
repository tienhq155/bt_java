package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

import java.util.Scanner;

// Cho mảng một chiều các số nguyên. Hãy viết hàm tìm số chẵn lớn 
// nhất nhỏ hơn mọi giá trị lẻ có trong mảng.
public class bt169 {
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
        for (int a : arr) {
            System.out.print(a + " ");
        }
        int minle = arr[0];
        int maxchan = arr[0];
        for (int x : arr) {
            if (x % 2 != 0) {
                if (x < minle) {
                    minle = x;
                }
            }
        }
        for (int x : arr) {
            if (x % 2 == 0 && x < minle) {
                if (x > maxchan) {
                    maxchan = x;
                }
            }
        }
        if (maxchan == -1) {
            System.out.print("abcxyz");
        }
    }
}
