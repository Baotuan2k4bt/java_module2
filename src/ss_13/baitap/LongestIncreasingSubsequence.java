package ss_13.baitap;

import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập chuỗi
        System.out.print("Nhập một chuỗi bất kỳ: ");
        String inputString = scanner.nextLine();

        // Gọi hàm tìm chuỗi con tăng dần lớn nhất
        String result = findLongestIncreasingSubsequence(inputString);

        // Hiển thị chuỗi con tăng dần
        System.out.println("Chuỗi tăng dần lớn nhất: " + result);


    }

    // Hàm tìm chuỗi con tăng dần lớn nhất
    public static String findLongestIncreasingSubsequence(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        // Chuỗi con kết quả
        StringBuilder longestSubsequence = new StringBuilder();
        // Thêm ký tự đầu tiên vào chuỗi con
        longestSubsequence.append(str.charAt(0));

        // Duyệt qua các ký tự của chuỗi
        for (int i = 1; i < str.length(); i++) {
            // Nếu ký tự hiện tại lớn hơn ký tự cuối cùng của chuỗi con thì thêm vào chuỗi con
            if (str.charAt(i) > longestSubsequence.charAt(longestSubsequence.length() - 1)) {
                longestSubsequence.append(str.charAt(i));
            }
        }

        return longestSubsequence.toString();
    }
}
