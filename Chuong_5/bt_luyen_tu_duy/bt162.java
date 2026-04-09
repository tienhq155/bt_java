package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

import java.util.Scanner;

// Cho mảng một chiều các số thực. Hãy viết hàm tìm một vị trí trong
// mảng thỏa hai điền kiện: có hai giá trị lân cận và giá trị tại vị trí đó
// bằng tích hai giá trị lân cận. Nếu mảng không tồn tại giá trị như vậy thì
// hàm trả về giá trị - 1
public class bt162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        int n = sc.nextInt();

        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextDouble();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double a : arr) {
            System.out.print(a + " ");
        }
        int vitri = timvitri(arr);
        if (vitri == -1) {
            System.out.print("\n-1");
        } else {
            System.out.print("\nVị trí thỏa điều kiện là : " + vitri);
        }
    }

    public static int timvitri(double[] arr) {
        if (arr.length < 3) {
            return -1;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i - 1] * arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
