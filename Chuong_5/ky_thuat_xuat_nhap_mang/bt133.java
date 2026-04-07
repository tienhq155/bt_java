package bt_java_tienhq.Chuong_5.ky_thuat_xuat_nhap_mang;

//Viết hàm liệt kê các vị trí mà giá trị tại đó là giá trị âm trong mảng một chiều các số thực.. 
import java.util.Scanner;

public class bt133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử : ");

        long[] arr = new long[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextLong();
        }
        System.out.print("Các vị trí của số âm trong mảng là : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
