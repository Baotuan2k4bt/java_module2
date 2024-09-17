package ss_13.baitap;

import java.util.Scanner;

public class LongestSortedSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập chuỗi từ người dùng
        System.out.print("Nhập một chuỗi bất kỳ: ");
        String inputString = scanner.nextLine();

        // Bước 2: Tìm chuỗi con có độ dài lớn nhất được sắp xếp tăng dần
        String longestSubsequence = findLongestSortedSubsequence(inputString);

        // Bước 3: Hiển thị chuỗi con
        System.out.println("Chuỗi con được sắp xếp theo thứ tự tăng dần có độ dài lớn nhất: " + longestSubsequence);

        scanner.close();
    }

    // Hàm tìm chuỗi con tăng dần có độ dài lớn nhất
    public static String findLongestSortedSubsequence(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        // Biến lưu trữ chuỗi con dài nhất hiện tại và chuỗi con tạm thời
        String longest = "";
        StringBuilder current = new StringBuilder();

        // Thêm ký tự đầu tiên vào chuỗi con tạm thời
        current.append(str.charAt(0));

        // Duyệt qua các ký tự trong chuỗi
        for (int i = 1; i < str.length(); i++) {
            // Nếu ký tự hiện tại lớn hơn hoặc bằng ký tự trước đó, thêm vào chuỗi con tạm thời
            if (str.charAt(i) >= str.charAt(i - 1)) {
                current.append(str.charAt(i));
            } else {
                // So sánh và cập nhật chuỗi con dài nhất
                if (current.length() > longest.length()) {
                    longest = current.toString();
                }
                // Bắt đầu một chuỗi con mới
                current.setLength(0);
                current.append(str.charAt(i));
            }
        }

        // Kiểm tra lại chuỗi con tạm thời lần cuối
        if (current.length() > longest.length()) {
            longest = current.toString();
        }

        return longest;
    }
}
