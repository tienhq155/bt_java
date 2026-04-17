package bt_java_tienhq.Chuong_5.bt_luyen_tu_duy;

//Cho mảng một chiều các số nguyên. Hãy viết hàm tìm giá trị đầu tiên 
//trong mảng có dạng 2k  .Nếu mảng không tồn tại giá trị dạng 2k  thì hàm 
//sẽ trả về giá trị 0
import java.util.Scanner;

public class bt166 {
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
        for (int a : arr) {
            System.out.print(a + " ");
        }
        boolean check = false;
        for (int i = 1; i < n; i++) {
            if (ischeck(arr[i])) {
                check = true;
            }
        }
        if (check == false) {
            System.out.print("giá trị 0");
        } else {
            System.out.print("Hàm có tồn tại giá trị 2^k");
        }
        sc.close();
    }

    public static boolean ischeck(int n) {
        if (n > 0) {
            while (n % 2 == 0) {
                n /= 2;
            }

        }
        return n == 1;
    }

}
