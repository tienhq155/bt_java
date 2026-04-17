package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

import java.util.Scanner;

// Hãy tìm giá trị thỏa điều kiện toàn chữ số lẻ và là giá trị lớn nhất thỏa 
// điều kiện ấy trong mảng một chiều các số nguyên (nếu mảng không có 
// giá trị thỏa điều kiện trên thì hàm trả về giá trị 0). 
public class bt167 {
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
        int maxle = -1;
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (ischeck(arr[i])) {
                if (check == false || arr[i] > maxle) {
                    maxle = arr[i];
                    check = true;
                }
            }
        }
        if (check == true) {
            System.out.print("kết quả là : " + maxle);
        }
    }

    public static boolean ischeck(int n) {
        int temp = n;
        while (temp > 0) {
            int check = temp % 10;
            if (check % 2 == 0) {
                return false;
            }
            temp /= 10;
        }
        return true;

    }
}
