package bt_java_tienhq.Chuong_5;
import java.util.Scanner;
//Viết hàm kiểm tra trong mảng các số nguyên có tồn tại giá trị chẵn nhỏ hơn 2004 hay không?
public class bt124 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        boolean check = false;
        long[] arr = new long[sc.nextInt()];
        for (int i = 0 ; i < arr.length; i++){
            System.out.print("Nhập Phần Tử Thứ " + (i+1) + ":");
            arr[i] = sc.nextLong();
            if(  arr[i] % 2 == 0 && arr[i] < 2004 ){
                check = true;
            }
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (long x : arr){
            System.out.print(x+ " ");
        }
        System.out.print("\nCó tồn tại giá trị chẵn nhỏ hơn 2004 : " + (check ? " có" : "không"));
        
        sc.close();
    }
    
}
