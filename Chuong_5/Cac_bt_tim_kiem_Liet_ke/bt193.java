package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

import java.util.Scanner;

//Cho mảng một chiều các số nguyên. Hãy viết hàm liệt kê các giá trị
// trong mảng có dạng 3k thì hàm sẽ trả về giá trị 0.
public class bt193 {
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
        System.out.print("kết quả là : ");
        boolean kiemtra = false;
        for (int x : arr) {
            if (ischeck(x)) {
                System.out.print(x + " ");
                kiemtra = true;
            }

        }
        if (!kiemtra) {
            System.out.print("0");
        }
        sc.close();
    }

    public static boolean ischeck(int n) {
        if (n < 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
