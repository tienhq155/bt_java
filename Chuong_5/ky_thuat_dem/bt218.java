package bt_java_tienhq.Chuong_5.ky_thuat_dem;

import java.util.Scanner;

//Đếm số lượng giá trị đối xứng trong mảng các số nguyên (demdoixung).
public class bt218 {
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
        long demdoixung = 0;
        for (int x : arr) {
            if (ischeck(x)) {
                demdoixung++;
            }
        }
        System.out.print("\nKết quả là : " + demdoixung);
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
