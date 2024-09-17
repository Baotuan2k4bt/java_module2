package ss_4.bai_tap;
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    // Phương thức khởi tạo
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Phương thức getter cho a
    public double getA() {
        return a;
    }

    // Phương thức getter cho b
    public double getB() {
        return b;
    }

    // Phương thức getter cho c
    public double getC() {
        return c;
    }

    // Phương thức tính delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);


    }
    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public String cal() {
        double detal = getDiscriminant();
        if (detal < 0) {
            return "Vo nghiem";
        }
        if (detal == 0) {
            return "Nghiem x1 = x2 =" + -b/2*a;
        }

        return "2 nghiem phan biet x1 =" + getRoot1() + " x2 = " + getRoot2();

    }
}
