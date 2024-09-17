package ss_6.bai_tap.bai2;

public class Triangle extends Shape {
    private double size1 = 1.0;
    private double size2 = 1.0;
    private double size3 = 1.0;

    public Triangle() {
    }

    public Triangle(String color, boolean filled, double size1,double size2,double size3) {
        super(color, filled);
        this.size1 = size1;
        this.size2=size2;
        this.size3=size3;
    }


    public double getPerimeter() {
        return size1+size2+size3;
    }
    public double getArea(){
        double s = getPerimeter() / 2; // nửa chu vi
        return Math.sqrt(s * (s - size1) * (s - size2) * (s - size3));
    }

   @Override
   public String toString() {
       return "A Shape with: A = " + size1 + ", B = " + size2 + ", C = " + size3+
               ", Area = " + getArea() + ", Perimeter = " + getPerimeter();
   }

}

