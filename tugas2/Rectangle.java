package tugasGrup.tugas2;

public class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(){

    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",Width=" + getWidth() + ", length=" + getLength() + "]";
    }


}
