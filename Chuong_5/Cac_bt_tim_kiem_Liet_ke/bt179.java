package bt_java_tienhq.Chuong_5.Cac_bt_tim_kiem_Liet_ke;

// Hãy liệt kê các giá trị trong mảng mà thỏa điều kiện lớn hơn trị tuyệt
// đối của giá trị đứng liền sau nó.
import java.util.Scanner;

public class bt179 {
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
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > Math.abs(arr[i + 1])) {
                System.out.print(
                        "\nCác giá trị trong mảng thỏa điều kiện : "
                                + arr[i]);
            }
        }
    }
}
