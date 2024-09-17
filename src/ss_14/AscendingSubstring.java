package ss_14;
import java.util.Scanner;

public class AscendingSubstring {
    public static String findAscendingSubstring(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char currentChar = input.charAt(0);
        result.append(currentChar);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) > currentChar) {
                currentChar = input.charAt(i);
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        String input = scanner.nextLine();

        String ascendingSubstring = findAscendingSubstring(input);

        System.out.println("Chuỗi con tăng dần lớn nhất là: " + ascendingSubstring);

        scanner.close();
    }
}
