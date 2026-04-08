package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

//Hãy tìm giá trị trong mảng các sô thực “xa giá trị x nhất” (xanhat).
import java.util.Scanner;

public class bt155 {
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
        System.out.print("\nNhập giá trị x: ");
        int x = sc.nextInt();

        int xanhat = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - x) > Math.abs(xanhat - x)) {
                xanhat = arr[i];
            }
        }
        System.out.print("\nGía trị xa x nhất trong mảng là : " + xanhat);
        sc.close();
    }
}
