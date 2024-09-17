package ss_19_Reguler_Expression.Bai_tap;
import java.util.regex.Pattern;

public class ClassNameValidator {

    // Phương thức kiểm tra tên lớp học hợp lệ
    public static boolean isValidClassName(String className) {
        // Biểu thức chính quy để kiểm tra tính hợp lệ
        String regex = "^[CAP]\\d{4}[GHIK]$";

        // Kiểm tra tên lớp học với biểu thức chính quy
        return Pattern.matches(regex, className);
    }

    public static void main(String[] args) {
        // Một số ví dụ kiểm tra
        String[] classNames = {"C1234G", "A5678H", "P0000I", "C123G", "B1234K", "A12345H", "P12G"};

        for (String className : classNames) {
            System.out.println("Tên lớp học \"" + className + "\" hợp lệ: " + isValidClassName(className));
        }
    }
}
