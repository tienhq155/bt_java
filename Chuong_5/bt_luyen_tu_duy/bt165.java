package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

// Hãy tìm giá trị đầu tiên trong mảng một chiều các số nguyên có chữ số 
// đầu tiên là chữ số lẻ (dauledautien). Nếu trong mảng không tồn tại giá 
// trị như vậy thì hàm sẽ trả về giá trị 0. 
import java.util.Scanner;

public class bt165 {
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
        int dauledautien = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sodautien(arr[i]) % 2 != 0) {
                dauledautien = arr[i];
                break;
            }
        }
        if (dauledautien == 0) {
            System.out.print("\nKhông tồn tại giá trị đầu tiên trong mảng có chữ số đầu tiên là chữ số lẻ.");
        } else {
            System.out.print("\nGiá trị đầu tiên trong mảng có chữ số đầu tiên là chữ số lẻ là: " + dauledautien);
        }
        sc.close();
    }

    public static int sodautien(int n) {
        int temp = Math.abs(n);
        while (temp >= 10) {
            temp /= 10;
        }
        return temp;
    }
}
