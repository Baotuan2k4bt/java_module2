package ss_11.baitap;
import java.util.HashMap;
import java.util.Map;
public class WordCount {
    public static void countWordOccurrences(String input) {
        // Tạo một HashMap để lưu trữ từ và số lần xuất hiện của nó
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Tách chuỗi thành các từ, sử dụng khoảng trắng làm dấu phân cách
        String[] words = input.split("\\s+");

        // Duyệt qua từng từ
        for (String word : words) {
            // Chuyển từ thành chữ thường để không phân biệt hoa thường
            word = word.toLowerCase();

            // Kiểm tra từ trong Map
            if (wordCountMap.containsKey(word)) {
                // Nếu từ đã tồn tại trong Map, tăng giá trị đếm lên 1
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // Nếu từ chưa tồn tại trong Map, thêm vào với giá trị ban đầu là 1
                wordCountMap.put(word, 1);
            }
        }

        // Hiển thị kết quả
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "This is a test. This test is only a test.";

        System.out.println("Chuỗi đầu vào: " + input);
        System.out.println("Số lần xuất hiện của mỗi từ:");

        // Gọi phương thức để đếm số lần xuất hiện của mỗi từ
        countWordOccurrences(input);
    }
}
