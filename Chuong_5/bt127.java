package bt_java_tienhq.Chuong_5;

//Viết hàm sắp xếp mảng một chiều các số thực tăng dần. 
import java.util.Scanner;
import java.util.Arrays;

public class bt127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        double temp;
        double[] arr = new double[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextDouble();

        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Dãy đã sắp xếp là : ");
        for (double x : arr) {
            System.out.print(x + " ");
        }
        
        System.out.print("\nDãy đã sắp xếp bằng thư viện là : ");
        Arrays.sort(arr);
        for (double x : arr){
            System.out.print(x + " ");
        }

        sc.close();
    }

}
