package bt_java_tienhq.Chuong_5.Ky_thuat_tinh_tong;

// Tính trung bình nhân các giá trị dương có trong mảng một chiều các số 
//thực (trungbinhnhan).
public class bt214 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("\nNhập số lượng phần tử : ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập Phần Tử Thứ " + (i + 1) + ":");
            arr[i] = sc.nextDouble();
        }
        System.out.print("Mảng Vừa Nhập Là : ");
        for (double a : arr) {
            System.out.print(a + " ");
        }

        double trungbinhnhan = 1.0;
        int dem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                trungbinhnhan *= arr[i];
                dem++;
            }
        }

        if (dem > 0) {
            trungbinhnhan = Math.pow(trungbinhnhan, 1.0 / dem);
        }
        System.out.print("\nKết quả là : " + trungbinhnhan);

        sc.close();
    }

}
