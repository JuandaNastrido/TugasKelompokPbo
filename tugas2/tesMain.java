package tugasGrup.tugas2;
public class tesMain {
    public static void main(String[] args) { 
//Membuat objek Circle upcast ke Shape
Shape s1 = new Circle(5.5, "RED", false); //Menambahkan "="

// Upcast Circle to Shape
//memanggil method
System.out.println(s1); //toString() dipanggil

System.out.println(s1.getArea()); //memperbaiki typo si -> s1

System.out.println(s1.getPerimeter()); //getPerimeter() dipanggil

System.out.println(s1.getColor()); //getColor() dipanggil

System.out.println(s1.isFilled()); //isFilledd() dipanggil, memperbaiki typo sl -> s1

// System.out.println(s1.getRadius()); //Shape tidak memiliki method getRadius()

//downcase Circle
Circle c1 = (Circle)s1; //menambahkakn "="

System.out.println(c1);

System.out.println(c1.getArea()); //memperbaiki typo cl -> c1

System.out.println(c1.getPerimeter()); 

System.out.println(c1.getColor());

System.out.println(c1.isFilled()); //memperbaiki typo cl -> c1

System.out.println(c1.getRadius());

// Shape 52 new Shape(); -> //Shape adalah abstract class tidak bisa di instansiasi

//Membuat Rectangle dan Upcast ke Shape
Shape s3 = new Rectangle(1.0, 2.0, "RED", false); //memperbaiki typo $3 -> s3, menambahkan "="

System.out.println(s3);

System.out.println(s3.getArea());

System.out.println(s3.getPerimeter());

System.out.println(s3.getColor());

// System.out.println(s3.getLength()); -> //Class Shape tidak memiliki getLength()

//Downcast kembali ke Rectangle
Rectangle r1 = (Rectangle)s3; //Menambahkan "="

System.out.println(r1);

System.out.println(r1.getArea());

System.out.println(r1.getColor()); //Memperbaiki typo rl->r1

System.out.println(r1.getLength());

//Membuat Square dan Upcast ke Shape
Shape s4  = new Square (6.6); //Memperbaiki typo 54 -> s4, Menambahkan "="

System.out.println(s4);

System.out.println(s4.getArea());

System.out.println(s4.getColor());

// System.out.println(s4.getSide()); //Class Shape tidak memiliki method getSide();

//Downcast Shape ke Rectangle (Superclass dari Square)
Rectangle r2 = (Rectangle)s4; //Menambahkan "="

System.out.println(r2);

System.out.println(r2.getArea());

System.out.println(r2.getColor());

// System.out.println(r2.getSide()); //Rectangle tidak memiliki method getSide();

System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square
Square sql = (Square)r2; //Memperbaiki typo sq1 -> menjadi sql, Menambahkan "="

System.out.println(sql);

System.out.println(sql.getArea());

System.out.println(sql.getColor());

System.out.println(sql.getSide());

System.out.println(sql.getLength());//Memperbaiki getlength -> getLength
    }
}