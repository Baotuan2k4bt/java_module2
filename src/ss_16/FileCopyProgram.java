package ss_16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập đường dẫn tệp nguồn
        System.out.print("Nhập đường dẫn tệp nguồn (source file): ");
        String sourcePath = scanner.nextLine();

        // Nhập đường dẫn tệp đích
        System.out.print("Nhập đường dẫn tệp đích (target file): ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra xem tệp nguồn có tồn tại hay không
        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại. Vui lòng kiểm tra lại.");
        } else if (targetFile.exists()) {
            // Kiểm tra xem tệp đích đã tồn tại chưa
            System.out.println("Tệp đích đã tồn tại. Vui lòng nhập một tệp tin khác.");
        } else {
            // Thực hiện sao chép tệp nguồn sang tệp đích
            try {
                int charactersCopied = copyFile(sourceFile, targetFile);
                System.out.println("Sao chép thành công. Số ký tự đã sao chép: " + charactersCopied);
            } catch (IOException e) {
                System.out.println("Đã xảy ra lỗi trong quá trình sao chép: " + e.getMessage());
            }
        }

        scanner.close();
    }

    // Phương thức sao chép tệp và trả về số ký tự đã sao chép
    public static int copyFile(File source, File target) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        int characterCount = 0;

        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(target);

            int byteData;
            // Đọc từng byte từ tệp nguồn và ghi vào tệp đích
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
                characterCount++; // Đếm số byte (ký tự) đã sao chép
            }
        } finally {
            // Đảm bảo đóng các luồng sau khi sao chép
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }

        return characterCount;
    }
}

