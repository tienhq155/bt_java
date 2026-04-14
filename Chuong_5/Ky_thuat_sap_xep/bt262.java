package bt_java_tienhq.Chuong_5.Ky_thuat_sap_xep;

import java.util.Scanner;

//Hãy sắp xếp các số chẵn trong mảng các số nguyên tăng dần, các số lẻ 
//cũng tăng dần. Vị trí tương đối giữa các số chẵn và số lẻ không đổi 
//(chantang)
public class bt262 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i]) % 2 == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if ((arr[j] % 2 == 0) && arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i]) % 2 != 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if ((arr[j] % 2 != 0) && arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.print("Mảnh mới Là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
