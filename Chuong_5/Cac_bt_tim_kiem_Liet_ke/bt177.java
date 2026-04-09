package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

import java.util.Scanner;

//Hãy liệt kê các số giá trị trong mảng một chiều các sô thực thuộc đoạn
//[x,y] cho trước.
public class bt177 {
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
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.print("\nNhập giá trị x :");
        int x = sc.nextInt();
        System.out.print("\nNhập giá trị y : ");
        int y = sc.nextInt();
        for (int a : arr) {
            if (a >= x && a <= y) {
                System.out.print("Các số có giá trị trong khoảng [ " + x + "] và [" + y + "] : " + a);
            }
        }
    }
}
