package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

import java.util.Scanner;

// Cho mảng một chiều các số nguyên. Hãy viết hàm tìm giá trị lớn nhất 
// trong mảng có dạng 5k . Nếu mảng không tồn tại giá trị dạng 5k thì hàm 
// sẽ trả về giá trị 0.
public class bt168 {
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
        boolean check = false;
        int max = -1;
        for (int i = 1; i < n; i++) {
            if (ischeck(arr[i])) {
                if (check == false || arr[i] > max) {
                    max = arr[i];
                    check = true;
                }
            }
        }
        if (check == false) {
            System.out.print("giá trị 0");
        } else {
            System.out.print("trong mảng tôn tại giá trị 5^k lớn nhất là : " + max);
        }
        sc.close();
    }

    public static boolean ischeck(int n) {
        if (n > 0) {
            while (n % 5 == 0) {
                n /= 5;
            }

        }
        return n == 1;
    }
}
