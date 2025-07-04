package tugasGrup.tugas1;
public class Shape {
    private String color="red";
    private boolean filled=true;
    
    public Shape(){

    }
    public Shape(String color, boolean filled){
        this.color = (color == null || color.trim().isEmpty()) ? "red" : color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = (color == null || color.trim().isEmpty()) ? "red" : color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "Shape[color=" + getColor() + ", filled=" + isFilled() + "]";
    }

}
