package bt_java_tienhq.Chuong_5.Ky_thuat_tinh_tong;

import java.util.Scanner;

//Tính tổng các giá trị có chữ số hàng chục là chữ số 5 có trong mảng các
//số nguyên (tongchuc).

public class bt203 {
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
        for (double a : arr) {
            System.out.print(a + " ");
        }
        int sum = 0;
        boolean check = false;
        for (int x : arr) {
            int hangchuc = ((Math.abs(x) / 10) % 10);
            if (hangchuc == 5) {
                sum += x;
                check = true;
            }
        }
        if (!check) {
            System.out.print("không có ");
        } else {
            System.out.print(" kết quả là " + sum);
        }
        sc.close();
    }
}
