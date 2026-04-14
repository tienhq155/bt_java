package bt_java_tienhq.Chuong_5.ky_thuat_dem;

//Hãy đếm số lượng “số nguyên tố” có trong mảng một chiều các số 
//nguyên (demnguyento). 
import java.util.Scanner;

public class bt223 {
    public static void main(String[] arger) {
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
        int demnguyento = 0;
        for (int a : arr) {
            if (isPrime(a)) {
                demnguyento++;
            }
        }
        System.out.print("\nKết quả là : " + demnguyento);
        sc.close();
    }

    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
