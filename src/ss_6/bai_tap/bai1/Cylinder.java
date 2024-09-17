package ss_6.bai_tap.bai1;

public class Cylinder  extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHight() {
        return height;
    }

    public void setHight(double hight) {
        this.height = height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height must be positive.");
        }
    }

    public double getVolume() {
        return getArea() * height;
    }
    @Override
    public String toString() {
        return String.format("Cylinder(radius=%.2f, height=%.2f, color=%s, volume=%.2f)",
                getRadius(), height, getColor(), getVolume());
    }
}
