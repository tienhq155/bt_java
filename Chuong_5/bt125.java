package bt_java_tienhq.Chuong_5;

import java.util.Scanner;

//Viết hàm đếm số lượng số nguyên tố nhỏ hơn 100 trong mảng.
public class bt125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        long[] arr = new long[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextLong();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (long x : arr) {
            System.out.print(x + " ");
        }
         
        System.out.print("\nCác số nguyên tố nhỏ hơn 100 trong mảng là : ");
        for(long x : arr){
            if (x <100 && isPrime(x)){
                System.out.print(x + " ");
                
            }
        }

        sc.close();
    }
    public static boolean isPrime( long n){
        if (n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

}
