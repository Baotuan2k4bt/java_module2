package ss_17;
import java.io.*;
import java.util.*;

public class ProductManager {

    private static final String FILENAME = "products.csv";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    System.out.println("Thoát khỏi chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    private static void addProduct() {
        System.out.print("Nhập mã sản phẩm: ");
        String productId = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String productName = scanner.nextLine();
        System.out.print("Nhập giá: ");
        String price = scanner.nextLine();
        System.out.print("Nhập hàng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập mô tả: ");
        String description = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
            writer.write(productId + "," + productName + "," + price + "," + manufacturer + "," + description);
            writer.newLine();
            System.out.println("Sản phẩm đã được thêm thành công!");
        } catch (IOException e) {
            System.err.println("Lỗi khi thêm sản phẩm: " + e.getMessage());
        }
    }

    private static void displayProducts() {
        File file = new File(FILENAME);
        if (!file.exists()) {
            System.out.println("Chưa có sản phẩm nào được lưu trữ.");
            return;
        }

        System.out.println("Danh sách sản phẩm:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] productDetails = line.split(",");
                System.out.printf("Mã sản phẩm: %s, Tên sản phẩm: %s, Giá: %s, Hàng sản xuất: %s, Mô tả: %s%n",
                        productDetails[0], productDetails[1], productDetails[2], productDetails[3], productDetails[4]);
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi hiển thị sản phẩm: " + e.getMessage());
        }
    }

    private static void searchProduct() {
        File file = new File(FILENAME);
        if (!file.exists()) {
            System.out.println("Chưa có sản phẩm nào được lưu trữ.");
            return;
        }

        System.out.print("Nhập mã sản phẩm cần tìm: ");
        String productId = scanner.nextLine();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] productDetails = line.split(",");
                if (productDetails[0].equals(productId)) {
                    found = true;
                    System.out.printf("Mã sản phẩm: %s, Tên sản phẩm: %s, Giá: %s, Hàng sản xuất: %s, Mô tả: %s%n",
                            productDetails[0], productDetails[1], productDetails[2], productDetails[3], productDetails[4]);
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi tìm kiếm sản phẩm: " + e.getMessage());
        }

        if (!found) {
            System.out.println("Không tìm thấy sản phẩm với mã: " + productId);
        }
    }
}
