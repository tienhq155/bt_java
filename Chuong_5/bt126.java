package bt_java_tienhq.Chuong_5;
import java.util.Scanner;
//Viết hàm tính tổng các giá trị âm trong mảng một chiều các số thực. 
public class bt126 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        int sum = 0;

        double[] arr = new double[sc.nextInt()];
        for (int i = 0 ; i < arr.length; i++){
            System.out.print("Nhập Phần Tử Thứ " + (i+1) + ":");
            arr[i] = sc.nextDouble();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (double x : arr){System.out.print(x + " ");}
        sc.close();
        for (double x : arr){
            if(x < 0 ) {
                sum += x;
            }
        }
        System.out.println("Tổng các giá trị âm trong mảng là : " + sum);
    }
}
