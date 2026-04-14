package bt_java_tienhq.Chuong_5.ky_thuat_dem;

import java.util.Scanner;

// Hãy xác định số lượng các phần tử kề nhau mà số đứng sau cùng dấu 
// số đứng trước và có giá trị tuyệt đối lớn hơn (demgiatri).
public class bt228 {
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
        int demgiatri = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] * arr[i + 1] > 0 && Math.abs(arr[i]) < Math.abs(arr[i + 1])) {
                demgiatri++;
            }
        }
        System.out.print("\nKết quả là : " + demgiatri);
        sc.close();
    }
}
