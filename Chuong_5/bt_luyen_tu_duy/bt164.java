package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

import java.util.Scanner;

//Cho mảng một chiều các số nguyên, hãy viết hàm tìm giá trị đầu tiên
//trong mảng thỏa tính chất số gánh. (ví dụ giá trị 12321)
public class bt164 {
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
        int ganh = -1;
        for (int i = 0; i < arr.length; i++) {
            if (isganh((int) arr[i])) {
                ganh = (int) arr[i];
                break;
            }
        }
        if (ganh == -1) {
            System.out.print("\nKhông tồn tại số gánh trong mảng.");
        } else {
            System.out.print("\nSố gánh đầu tiên trong mảng là: " + ganh);
        }

    }

    public static boolean isganh(int n) {
        if (n < 0) {
            return false;
        }
        String s = String.valueOf(n);
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);
    }
}
