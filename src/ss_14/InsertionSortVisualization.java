package ss_14;

import java.util.Scanner;

public class InsertionSortVisualization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập kích thước của mảng
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Bước 2: Nhập các phần tử cho mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 3: Thực hiện sắp xếp chèn và hiển thị từng bước
        insertionSort(array);

        scanner.close();
    }

    // Hàm sắp xếp chèn (Insertion Sort) và hiển thị từng bước
    public static void insertionSort(int[] array) {
        int n = array.length;

        // Bắt đầu từ phần tử thứ 2 đến cuối mảng
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Di chuyển các phần tử của array[0...i-1] lớn hơn key về sau một vị trí
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;

                // Hiển thị trạng thái hiện tại của mảng sau mỗi lần hoán đổi
                displayArray(array, i, j + 1);
            }

            // Đặt key vào vị trí đúng
            array[j + 1] = key;

            // Hiển thị trạng thái của mảng sau khi key đã được chèn
            System.out.println("Sau khi chèn " + key + ": ");
            displayArray(array, i, j + 1);
            System.out.println("--------------------------");
        }
    }

    // Hàm hiển thị mảng và đánh dấu phần tử đang xử lý
    public static void displayArray(int[] array, int currentIndex, int keyIndex) {
        for (int i = 0; i < array.length; i++) {
            if (i == keyIndex) {
                System.out.print("[" + array[i] + "] ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
