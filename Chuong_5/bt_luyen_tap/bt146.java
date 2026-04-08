package bt_java_tienhq.Chuong_5.bt_luyen_tap;

import java.util.Scanner;

// Tìm giá trị âm đầu tiên trong mảng một chiều các sô thực (amdau). Nếu
// mảng không có giá trị âm thì trả về giá trị không âm là giá trị 1.
public class bt146 {
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

        double amdau = 1;

        for (double x : arr) {
            if (x < 0) {
                amdau = x;
                break;
            }
        }
        System.out.println("Giá trị am đầu tiên trong mảng là : " + amdau);
        sc.close();
    }
}
