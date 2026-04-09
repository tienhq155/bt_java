package bt_java_tienhq.Chuong_5.bt_luyen_tap;

import java.util.Scanner;

// Tìm “số dương cuối cùng” trong mảng số thực (duongcuoi). Nếu mảng
// không có giá trị dương thì trả về giá trị - 1
public class bt147 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        double duongcuoi = -1;
        double[] arr = new double[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextDouble();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double x : arr) {
            System.out.print(x + " ");
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                duongcuoi = arr[i];
                break;
            }
        }
        System.out.println("Giá trị dương cuối cùng trong mảng là : " + duongcuoi);
        sc.close();

    }

}
