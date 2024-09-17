package ss_4.thuc_hanh;

public class Rectangle {
    private double _width;
    private double _height;

    public Rectangle(){}

    public Rectangle(double width, double height) {
        this._width = width;
        this._height = height;
    }

    public double getArea() {
        return this._width * this._height;
    }


}
