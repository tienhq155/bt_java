package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

// Cho mảng một chiều các số thực, hãy viết hàm tìm giá trị âm cuối cùng
// lớn hơn giá trị -1 (cuoicung). Nếu mảng không có giá trị thỏa điều kiện
// trên thì hàm trả về giá trị không chẵn là 0.
import java.util.Scanner;

public class bt160 {
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
        double cuoicung = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 0 && arr[i] > -1) {
                cuoicung = arr[i];
                break;
            }
        }
        if (cuoicung == 0) {
            System.out.print("\nKhông có giá trị âm cuối cùng lớn hơn -1 trong mảng là : " + cuoicung);
        } else {
            System.out.print("\nGiá trị âm cuối cùng lớn hơn -1 trong mảng là : " + cuoicung);
        }
        sc.close();
    }
}
