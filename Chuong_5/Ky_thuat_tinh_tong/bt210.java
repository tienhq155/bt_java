package bt_java_tienhq.Chuong_5.Ky_thuat_tinh_tong;

//Tính tổng các giá trị có chữ số đầu tiên là chữ số chẵn có trong mảng
//các số nguyên (tongdauchan).
import java.util.Scanner;

public class bt210 {
    public static void main(String[] arger) {
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
        int tongdauchan = 0;
        for (int a : arr) {
            if (sodautien(a) % 2 == 0) {
                tongdauchan += a;
                System.out.print("\nKết quả là :" + tongdauchan);
            }
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
