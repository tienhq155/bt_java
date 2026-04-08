package bt_java_tienhq.Chuong_5.ky_thuat_dat_linh_canh;

import java.util.Scanner;

//Tìm “số chẵn cuối cùng” trong mảng một chiều các số nguyên 
//(chancuoi). Nếu mảng không có giá trị chẵn thì trả về giá trị -1.
public class bt136 {
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
        for (double x : arr) {
            System.out.print(x + " ");
        }
        int chancuoi = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                chancuoi = (int) arr[i];
                break;
            }

        }
        System.out.print("\nSố chẵn cuối cùng trong mảng là " + chancuoi);
        sc.close();
    }

}
