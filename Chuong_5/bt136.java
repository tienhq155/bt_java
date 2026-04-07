package bt_java_tienhq.Chuong_5;

import java.util.Scanner;
//Tìm “số chẵn cuối cùng” trong mảng một chiều các số nguyên 
//(chancuoi). Nếu mảng không có giá trị chẵn thì trả về giá trị -1.
public class bt136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        double[] arr = new double[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextDouble();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double x : arr) {
            System.out.print(x + " ");
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.print("\nSố chẵn cuối cùng của mảng là " + arr[i]);
                break;
            }    
            // else{
            //     System.out.print("\nSố chẵn cuối cùng của mảng là " + (-1));
            // }
        }
        
        sc.close();
    }
    
}
