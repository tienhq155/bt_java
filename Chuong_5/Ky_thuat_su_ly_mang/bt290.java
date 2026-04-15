package bt_java_tienhq.Chuong_5.Ky_thuat_su_ly_mang;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

//. Hãy đảo ngược thứ tự các số chẵn và các số lẻ trong mảng mà vẫn giữ 
//nguyên vị trí tương đối của chúng (daonguocchanle). 
public class bt290 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.print("Mảnh Vừa NHập Là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        ArrayList<Integer> mangle = new ArrayList<>();
        ArrayList<Integer> mangchan = new ArrayList<>();
        for (int x : arr) {
            if (arr[x] % 2 == 0) {
                mangchan.add(x);
            } else {
                mangle.add(x);
            }
        }
        Collections.reverse(mangchan);
        Collections.reverse(mangle);
        int inchan = 0, inle = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = mangchan.get(inchan++);
            } else {
                arr[i] = mangle.get(inle++);
            }
        }
        System.out.print("Mảng mới là : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
