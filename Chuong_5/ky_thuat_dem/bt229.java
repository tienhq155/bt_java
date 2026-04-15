package bt_java_tienhq.Chuong_5.ky_thuat_dem;

import java.util.Scanner;

//Hãy đếm số lượng các giá trị phân biệt có trong mảng (demphanbiet).
public class bt229 {
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
        int demphanbiet = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean check = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                demphanbiet++;
            }
        }
        System.out.print("kết quả là : " + demphanbiet);
        sc.close();
    }
}
