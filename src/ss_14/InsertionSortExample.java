package ss_14;

public class InsertionSortExample {

    public static void insertionSort(int[] list) {
        int n = list.length;

        // Duyệt qua từng phần tử của mảng, bắt đầu từ phần tử thứ 2
        for (int i = 1; i < n; i++) {
            int key = list[i];  // Phần tử cần chèn vào vị trí đúng
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key về sau một vị trí
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }

            // Chèn key vào đúng vị trí của nó
            list[j + 1] = key;
        }
    }

    // Hàm main để chạy thử phương thức insertionSort
    public static void main(String[] args) {
        int[] list = {12, 11, 13, 5, 6};

        System.out.println("Mảng ban đầu:");
        printArray(list);

        // Gọi hàm insertionSort để sắp xếp mảng
        insertionSort(list);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(list);
    }

    // Hàm hỗ trợ in mảng
    public static void printArray(int[] list) {
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

