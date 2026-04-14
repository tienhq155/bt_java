package bt_java_tienhq.Chuong_5.Ky_thuat_tinh_tong;

import java.util.Scanner;

// Tính tổng các giá trị đối xứng trong mảng các số nguyên (tongdoixung). 
public class bt209 {
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
        long tongdoixung = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ischeck(arr[i])) {
                tongdoixung += arr[i];
            }
        }
        System.out.print("\nKết quả là : " + tongdoixung);
        sc.close();
    }

    public static boolean ischeck(int n) {
        int temp = n;
        long sodaonguoc = 0;
        while (temp > 0) {
            int chuso = temp % 10;
            sodaonguoc = sodaonguoc * 10 + chuso;
            temp = temp / 10;
        }
        return n == sodaonguoc;
    }
}
