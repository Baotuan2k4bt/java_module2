package ss_11.baitap;
import java.util.Stack;
public class DecimalToBinary {
    public static String convertToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder binaryNumber = new StringBuilder();

        // Tiến hành chia số thập phân cho 2 và đẩy phần dư vào Stack
        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal = decimal / 2;
        }

        // Pop các phần tử từ Stack để tạo ra chuỗi nhị phân
        while (!stack.isEmpty()) {
            binaryNumber.append(stack.pop());
        }

        // Trả về chuỗi nhị phân
        return binaryNumber.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 233;

        // Gọi phương thức để chuyển đổi từ thập phân sang nhị phân
        String binaryNumber = convertToBinary(decimalNumber);

        System.out.println("Số " + decimalNumber + " trong hệ nhị phân là: " + binaryNumber);
    }
}
