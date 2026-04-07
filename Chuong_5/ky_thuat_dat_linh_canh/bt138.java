package bt_java_tienhq.Chuong_5.ky_thuat_dat_linh_canh;

import java.util.Scanner;

// Tìm “vị trí của giá trị chẵn đầu tiên” trong mảng một chiều các số 
// nguyên (vitrichandau). Nếu mảng không có giá trị chẵn thì hàm sẽ trả 
// về giá trị là – 1. 
public class bt138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        double[] arr = new double[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextDouble();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double x : arr) {
            System.out.print(x + " ");
        }
        for (int i  = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print("\nSố chẵn đầu tiên của mảng là " + arr[i]);
                break;
            }
            // else{
            // System.out.print("\nSố chẵn cuối cùng của mảng là " + (-1));
            // }
        }

        sc.close();
    }
}
