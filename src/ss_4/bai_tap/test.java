package ss_4.bai_tap;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào 3 giá trị cho a, b, c
        System.out.print("Nhập vào hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập vào hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập vào hệ số c: ");
        double c = scanner.nextDouble();

        // Tạo đối tượng QuadraticEquation
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        // Tính delta
        equation.cal();
    }
}
