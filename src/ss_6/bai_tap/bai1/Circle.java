package ss_6.bai_tap.bai1;
import  java.util.Scanner;
public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius,String color ) {
        this.radius = radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
      return Math.PI * radius * radius;
    }

    @Override
    public String toString() {

            return String.format("Circle(radius=%.2f, color=%s, area=%.2f)", radius, color, getArea());

    }
}
