package bt_java_tienhq.Chuong_5.ky_thuat_dem;

import java.util.Scanner;

//  Hãy đếm số lượng giá trị có chữ số tận cùng bằng 5 trong mảng các số 
// nguyên (demtancung). 
public class bt220 {
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
        int demtancung = 0;
        for (int x : arr) {
            if (ischeck(x)) {
                demtancung++;
            }
        }
        System.out.print("\nKết quả là : " + demtancung);
        sc.close();
    }

    public static boolean ischeck(int n) {
        int temp = n;
        int check = temp % 10;
        return check == 5;
    }
}
