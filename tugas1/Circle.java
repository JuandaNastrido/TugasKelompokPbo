package tugasGrup.tugas1;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){    
    
    }
    public Circle(double radius){
        this.radius = (radius <= 0 ) ? 1.0 : radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = (radius <= 0 ) ? 1.0 : radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = (radius <= 0 ) ? 1.0 : radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }

}



