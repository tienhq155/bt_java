package bt_java_tienhq.Chuong_5.ky_thuat_dem;

import java.util.Scanner;

//  Hãy cho biết sự tương quan giữa số lượng số chẵn và số lượng số lẻ 
// trong mảng các số nguyên (tuongquanchanle) - 
// Hàm này trả về một trong ba giá trị -1, 0, và 1. 
// - Giá trị -1 có nghĩa số lượng số chẵn nhiều hơn số lẻ. 
// - Giá trị 0 có nghĩa số lượng số lẻ bằng số lượng số chẵn 
// - Giá trị 1 có nghĩa số lẻ nhiều hơn số chẵn
public class bt221 {
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
        for (double a : arr) {
            System.out.print(a + " ");
        }
        int sole = 0;
        int sochan = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sochan++;
            } else {
                sole++;
            }
        }
        if (sole > sochan) {
            System.out.print("1");
        } else if (sole < sochan) {
            System.out.print("-1");
        } else {
            System.out.print("0");
        }
    }
}
