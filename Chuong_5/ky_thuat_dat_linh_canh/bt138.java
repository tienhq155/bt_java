package bt_java_tienhq.Chuong_5.ky_thuat_dat_linh_canh;

import java.util.Scanner;

// Tìm “vị trí của giá trị chẵn đầu tiên” trong mảng một chiều các số 
// nguyên (vitrichandau). Nếu mảng không có giá trị chẵn thì hàm sẽ trả 
// về giá trị là – 1. 
public class bt138 {
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
        for (int x : arr) {
            System.out.print(x + " ");
        }
        int vitrichandau = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                vitrichandau = i;
                break;
            }
        }
        if (vitrichandau == -1) {
            System.out.print("\nVị trí của số chẵn đầu tiên trong mảng là -1 ");
        } else {
            System.out.print("\nVị trí của số chẵn đầu tiên trong mảng là " + (vitrichandau + 1));
        }

        sc.close();
    }
}
