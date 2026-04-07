package bt_java_tienhq.Chuong_5;
import java.util.Scanner;
// Viết hàm tìm một vị trí mà giá trị tại vị trí đó là một giá trị nhỏ nhất trong mảng một chiều các số nguyên. 
public class bt123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử : ");
        long[] arr = new long[sc.nextInt()];
        int i = 0;
        int min  = 0;
        do{
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextLong();
            if (arr[i] < arr[min]){
                min = i;
            }
            i++;
        }while(i < arr.length);
        System.out.println("Vị trí của giá trị nhỏ nhất là : " + (min+1));
    }
}
