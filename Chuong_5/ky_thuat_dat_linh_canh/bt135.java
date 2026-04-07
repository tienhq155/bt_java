package bt_java_tienhq.Chuong_5.ky_thuat_dat_linh_canh;

import java.util.Scanner;

// Tìm “giá trị dương đầu tiên” trong mảng một chiều các số thực (duongdau). Nếu mảng không có giá trị dương thì trả về giá trị -1. 
public class bt135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        double duongdau  = -1;

        double[] arr = new double[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextDouble();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
        for (double x : arr){
            if (x >0){
                duongdau = x;
                break;
            }
        }
        System.out.println("Giá trị dương đầu tiên trong mảng là : " + duongdau);
    }
}
