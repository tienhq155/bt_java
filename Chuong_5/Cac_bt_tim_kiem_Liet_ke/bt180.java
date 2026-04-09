package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

import java.util.Scanner;

// Hãy liệt kê các giá trị trong mảng mà thỏa điều kiện nhỏ hơn trị tuyệt
// đối của giá trị đứng liền sau nó và lớn hơn giá trị đứng liền trước nó
public class bt180 {
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
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < Math.abs(arr[i + 1]) && arr[i] > arr[i - 1]) {
                System.out.print(
                        "\nCác giá trị trong mảng mà thỏa điều kiện nhỏ hơn trị tuyệt đối của giá trị đứng liền sau nó và lớn hơn giá trị đứng liền trước nó : "
                                + arr[i]);
            }
        }
    }
}
