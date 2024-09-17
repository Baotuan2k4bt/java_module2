package ss_15.BT;

import java.util.Scanner;

public class TriangleChecker{
public static void checkTriangle(double a, double b, double c) throws TriangleException {
    // Kiểm tra nếu có cạnh nào âm hoặc bằng không
    if (a <= 0 || b <= 0 || c <= 0) {
        throw new TriangleException("Cạnh của tam giác không thể là số âm hoặc bằng không.");
    }

    // Kiểm tra nếu tổng của hai cạnh không lớn hơn cạnh còn lại
    if (a + b <= c || a + c <= b || b + c <= a) {
        throw new TriangleException("Tổng của hai cạnh phải lớn hơn cạnh còn lại.");
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
        // Nhập vào 3 cạnh của tam giác
        System.out.print("Nhập vào cạnh thứ nhất: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập vào cạnh thứ hai: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập vào cạnh thứ ba: ");
        double c = scanner.nextDouble();

        // Kiểm tra tam giác
        checkTriangle(a, b, c);
        System.out.println("Đây là một tam giác hợp lệ.");

    } catch (TriangleException e) {
        System.out.println("Lỗi: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Đã xảy ra lỗi không mong muốn.");
    } finally {
    }

}
}
