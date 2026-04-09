package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

// Cho mảng một chiều các số thực hãy tìm giá trị đầu tiên lớn hơn giá trị
// 2003 (dautien). Nếu mảng không có giá trị thỏa điều kiện trên thì hàm
// trả về giá trị là 0.
import java.util.Scanner;

public class bt159 {
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
        int dautien = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 2003) {
                dautien = arr[i];
                break;
            }
        }
        if (dautien == 0) {
            System.out.print("giá trị đầu tiên lớn hơn giá trị 2003 là : " + dautien);
        } else {
            System.out.print("giá trị đầu tiên lớn hơn giá trị 2003 là : " + dautien);
        }
        sc.close();
    }
}
