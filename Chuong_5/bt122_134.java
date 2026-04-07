package bt_java_tienhq.Chuong_5;

import java.util.Scanner;

//Tìm giá trị lớn nhất trong mảng một chiều các số thực.
public class bt122_134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử : ");

        long[] arr = new long[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextLong();
        }
        double max = arr[0];
        for (double x : arr) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là : " + max);
    }
}
