package ss_19_Reguler_Expression.Bai_tap;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

    // Phương thức kiểm tra số điện thoại hợp lệ
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Biểu thức chính quy để kiểm tra tính hợp lệ
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

        // Kiểm tra số điện thoại với biểu thức chính quy
        return Pattern.matches(regex, phoneNumber);
    }

    public static void main(String[] args) {
        // Một số ví dụ kiểm tra
        String[] phoneNumbers = {
                "(12)-(0123456789)",
                "(34)-(0987654321)",
                "(01)-(0123456789)",
                "(99)-(1234567890)",
                "(12)-(123456789)",   // Không đủ 10 số
                "12-0123456789",       // Sai định dạng dấu ngoặc
                "(12)-0123456789"      // Thiếu dấu ngoặc đơn quanh số 0
        };

        for (String phoneNumber : phoneNumbers) {
            System.out.println("Số điện thoại \"" + phoneNumber + "\" hợp lệ: " + isValidPhoneNumber(phoneNumber));
        }
    }
}

