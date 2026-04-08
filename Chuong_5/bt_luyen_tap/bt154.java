package bt_java_tienhq.Chuong_5.bt_luyen_tap;

import java.util.Scanner;

// tìm “vị trí giá trị âm lớn nhất” trong mảng các số thực
// (vtamlonnhat). Nếu mảng không có giá trị âm thì trả về -1
public class bt154 {

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
        for (int x : arr) {
            System.out.print(x + " ");
        }
        int amlonnhat = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (amlonnhat == -1 || arr[i] > arr[amlonnhat]) {
                    amlonnhat = i;
                }
            }
        }
        System.out.print("\n Vị trí Giá trị âm lớn nhất trong mảng là " + amlonnhat);
        sc.close();
    }
}
