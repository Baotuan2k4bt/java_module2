package ss_3.bai_tap;
import java.util.Scanner;
public class tim_giatrinn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập kích thước mảng :");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập phần tử thứ :");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        // Bướ 4: Duyệt qua mảng từ phần tử thứ hai đến hết.
        for (int i = 1; i < n; i++) {
            // So sánh từng phần tử tiếp theo với giá trị nhỏ nhất.
            if (array[i] < min) {
                // Nếu phần tử tiếp theo nhỏ hơn giá trị nhỏ nhất, thì cập nhật giá trị nhỏ nhất.
                min = array[i];
            }
            // Bước 5: Khi hoàn thành duyệt mảng, in ra giá trị nhỏ nhất.

        }
        System.out.println("Giá trị nhỏ nhất trong mảng là:"+ min);
    }



}