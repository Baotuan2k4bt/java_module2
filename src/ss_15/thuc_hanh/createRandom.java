package ss_15.thuc_hanh;
import java.util.Random;
import java.util.Scanner;
public class createRandom {
    public Integer[] generateRandomArray() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];

        System.out.println("Danh sach phan tu cua mang:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Để xuống dòng sau khi in mảng
        return arr;
    }
    public static void main(String[] args) {
        createRandom createRandom = new createRandom();
        Integer[] arr = createRandom.generateRandomArray();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}


