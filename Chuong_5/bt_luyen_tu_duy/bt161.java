package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

import java.util.Scanner;

// Cho mảng một chiều các số nguyên, hãy tìm giá trị đầu tiên trong mảng
// nằm trong khoảng (x,y) cho trước (dautientrongdoan). Nếu mảng
// không có giá trị thỏa điều kiện trên thì hàm trả về giá trị là x.
public class bt161 {
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
        System.out.print("\nNhập giá trị x :");
        double x = sc.nextDouble();
        System.out.print("Nhập giá trị y :");
        double y = sc.nextDouble();

        double dautien = x;
        for (double a : arr) {
            if (a > x && a < y) {
                dautien = a;
                break;
            }
        }
        System.out.print("\nGiá trị đầu tiên trong khoảng (" + x + "," + y + ") là : " + dautien);
        sc.close();
    }

}
