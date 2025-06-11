package tugasKelompok.tugas1;

public class Rectangle extends Shape{
    double width = 1.0;
    double length = 1.0;

    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width = (width <= 0 ) ? 1.0 : width;
        this.length = (length <=0 ) ? 1.0 : length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = (width <= 0 ) ? 1.0 : width;
        this.length = (length <=0 ) ? 1.0 : length; 
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = (width <= 0 ) ? 1.0 : width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = (length <=0 ) ? 1.0 : length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",Width=" + width + ", length=" + length + "]";
                }
}
