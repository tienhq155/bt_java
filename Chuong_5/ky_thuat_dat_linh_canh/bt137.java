package bt_java_tienhq.Chuong_5;

import java.util.Scanner;

// Tìm “một vị trí mà giá trị tại vị trí đó là giá trị nhỏ nhất” trong mảng 
// một chiều các số thực (vitrinhonhat). 
public class bt137 {
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
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        System.out.print("Vị trí của số nhỏ nhất trong mảng là : " + (min+1));

        sc.close();
    }

}
