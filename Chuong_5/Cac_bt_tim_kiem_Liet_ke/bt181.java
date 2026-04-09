package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

import java.util.Scanner;

// Cho mảng một chiều các số nguyên. Hãy viết hàm liệt kê các giá trị
// chẵn có ít nhất một lân cận cũng là giá trị chẵn
public class bt181 {
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                boolean hasEvenNeighbor = (i > 0 && arr[i-1] % 2 == 0) || (i < arr.length - 1 && arr[i+1] % 2 == 0);
                if (hasEvenNeighbor) {
                    System.out.print("\nkết quả là : " + arr[i]);
                }
            }
        }
    }
}
