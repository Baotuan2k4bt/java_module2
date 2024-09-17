package ss_13.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khởi tạo một mảng với các giá trị nhập từ bàn phím
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Nhập các giá trị cho mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Sắp xếp mảng theo thứ tự từ bé đến lớn
        Arrays.sort(array);
        System.out.println("Mảng đã sắp xếp: " + Arrays.toString(array));

        // Bước 3: Nhập giá trị cần tìm trong mảng
        System.out.print("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();

        // Bước 3-7: Tìm giá trị bằng thuật toán tìm kiếm nhị phân
        int result = binarySearch(array, 0, size - 1, value);

        // Hiển thị kết quả
        if (result == -1) {
            System.out.println("Không tìm thấy giá trị " + value + " trong mảng.");
        } else {
            System.out.println("Giá trị " + value + " được tìm thấy tại vị trí: " + result);
        }


    }

    // Bước 3: Khai báo hàm binarySearch
    public static int binarySearch(int[] array, int left, int right, int value) {
        // Bước 8: Lặp lại cho đến khi left > right
        while (left <= right) {
            // Bước 4: Tính middle
            int middle = (left + right) / 2;

            // Bước 5: Nếu giá trị tại middle bằng với value thì trả về middle
            if (array[middle] == value) {
                return middle;
            }

            // Bước 6: Nếu value lớn hơn giá trị tại middle, tìm ở nửa phải
            if (array[middle] < value) {
                left = middle + 1;
            }
            // Bước 7: Nếu value nhỏ hơn giá trị tại middle, tìm ở nửa trái
            else {
                right = middle - 1;
            }
        }

        // Nếu không tìm thấy, trả về -1
        return -1;
    }
}
