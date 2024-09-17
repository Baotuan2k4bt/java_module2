package ss_11.baitap;
import java.util.Stack;
public class Daonguocmang {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        // Đưa từng phần tử của mảng vào Stack
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        // Pop từng phần tử từ Stack ra và gán lại vào mảng
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Mảng ban đầu:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Đảo ngược mảng
        reverseArray(array);

        System.out.println("\nMảng sau khi đảo ngược:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
