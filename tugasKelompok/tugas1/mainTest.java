package tugasKelompok.tugas1;

import java.util.Scanner;

public class mainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;
        int bentuk = 0;
        Shape [] dataShape = new Shape[100];
        int count = 0;

        do{
        System.out.println("-Program Testing Kelas Shape, Rectangle, Circle, dan Square-");
        System.out.println("1. Input Shape");
        System.out.println("2. Edit Shape");
        System.out.println("3. Tampilkan Shape");
        System.out.println("4. Cari Luas dan Keliling");
        System.out.println("5. Keluar");
        System.out.println("Pilihan: ");
        pilihan = scanner.nextInt();
        scanner.nextLine();
        
        switch (pilihan) {
            case 1:
                    System.out.println("-Menu Shape-");
                    System.out.println("Pilih bentuk yang ingin di uji:");
                    System.out.println("1. Shape");
                    System.out.println("2. Rectangle");
                    System.out.println("3. Circle");
                    System.out.println("4. Square");
                    bentuk = scanner.nextInt();
                    scanner.nextLine();

                    if (bentuk == 1) {
                        System.out.println("Masukkan warna : (default : red)");
                        String color = scanner.nextLine();
                        System.out.println("Apakah filled (true or false) : (default : true)");
                        boolean filled = scanner.nextBoolean();
                        scanner.nextLine();

                        dataShape[count] = new Shape(color, filled);
                        count++;
                        System.out.println("Shape berhasil ditambahkan!");
                    }

                    else if (bentuk == 2) {
                        System.out.println("Masukkan Lebar : (default : 1.0)");
                        double width = scanner.nextInt();
                        System.out.println("Masukkan Panjang (default : 1.0)");
                        double length = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Masukkan warna : (default : red)");
                        String color = scanner.nextLine();
                        System.out.println("Apakah filled (true/false) : (default : true)");
                        boolean filled = scanner.nextBoolean();
                        scanner.nextLine();

                        dataShape[count] = new Rectangle(width, length, color, filled);
                        count++;
                        System.out.println("Rectangle berhasil ditambahkan!");
                    }
                    else if (bentuk == 3){
                        System.out.println("Masukkan jari-jari : (default : 1.0)");
                        double radius = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Masukkan warna : (default :red)");
                        String color = scanner.nextLine();
                        System.out.println("Apakah filled (true/false) : (default : true)");
                        boolean filled = scanner.nextBoolean();

                        dataShape[count] = new Circle(radius, color, filled);
                        count++;
                        System.out.println("Circle berhasil ditambahkan!");
                    }
                    else if (bentuk == 4) {
                        System.out.println("Masukan sisi : ");
                        double side = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Masukkan warna : (default :red)");
                        String color = scanner.nextLine();
                        System.out.println("Apakah filled (true/false) : (default : true)");
                        boolean filled = scanner.nextBoolean();

                        dataShape[count] = new Square(side, color, filled);
                        count++;
                        System.out.println("Square berhasil ditambahkan"); 
                    }
                    else{
                        System.out.println("Pilihan tidak valid!");
                    }   
                break;
            case 2 : 
                    if (count == 0 ) {
                        System.out.println("Belum ada shape yang di input!");
                        break;
                    }

                    System.out.println("\n-Daftar Shape-");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i+1) + ". " + dataShape[i].getClass().getSimpleName());
                    }

                    System.out.println("Pilih shape yang ingin di edit (1-" + count + "): ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine();

                    if (editIndex < 0 || editIndex >= count) {
                        System.out.println("Pilihan index tidak valid");
                        break;
                    }

                    Shape shapeToEdit = dataShape[editIndex];
                    System.out.println("Data saat ini");
                    System.out.println(shapeToEdit.toString());

                    System.out.println("Masukkan warna baru (Kosongkan jika tidak ingin mengubah warna)");
                    String newColor = scanner.nextLine();
                    if (!newColor.isEmpty()) {
                        shapeToEdit.setColor(newColor);
                    }

                    System.out.println("Apakah filled (true/false, Kosongkan jika tidak ingin mengubah filled)");
                    String newFilled = scanner.nextLine();
                    if (!newFilled.isEmpty()) {
                        shapeToEdit.setFilled(Boolean.parseBoolean(newFilled));
                    }

                    if (shapeToEdit instanceof Rectangle) {
                        Rectangle rect = (Rectangle) shapeToEdit;
                        System.out.println("Masukkan lebar baru (0 jika tidak ingin diubah): ");
                        double newWidth = scanner.nextDouble();
                        if (newWidth > 0) {
                            rect.setWidth(newWidth);
                        }

                        if (shapeToEdit instanceof Square) {
                            System.out.println("Masukkan panjang baru (0 jika tidak ingin diubah): ");
                            double newLength = scanner.nextDouble();
                            if (newLength > 0) {
                                rect.setLength(newLength);
                            }
                        }
                    scanner.nextLine();
                    }
                    
                    else if (shapeToEdit instanceof Circle){
                        Circle circle = (Circle) shapeToEdit;
                        System.out.println("Masukan radius baru (0 jika tidak ingin diubah); ");

                        double newRadius = scanner.nextDouble();
                        if (newRadius > 0) {
                            circle.setRadius(newRadius);
                        }
                        scanner.nextLine();
                    }
                    
                    System.out.println("Shape berhasil di update!");
                    break;

                case 3 :
                    if (count == 0) {
                        System.out.println("Belum ada data yang diinputkan! ");
                        break;
                    }
                    System.out.println("\n -Daftar Shape-");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i+1) + ". " + dataShape[i].toString());
                        System.out.println("------------------------");
                    }
                    break;
                
                case 4 :
                    if (count == 0) {
                        System.out.println("Belum ada data yang diinputkan! ");
                        break;
                    }
                    
                    System.out.println("\n -Daftar Shape-");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i+1) + ". " + dataShape[i].toString());
                    }

                    System.out.println("Pilih shape yang mau dihitung luas dan kelilingnya (1-" + count + "): ");
                    int hitungIndex = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (hitungIndex < 0 || hitungIndex >= count) {
                        System.out.println("Index tidak valid!");
                        break;
                    }

                    Shape selectedShape = dataShape[hitungIndex];

                    System.out.println("\n -Informasi Shape-");
                    System.out.println(selectedShape.toString());

                    if (selectedShape instanceof Circle) {
                        Circle circle = (Circle) selectedShape;
                        System.out.println("Luas lingkaran: " + String.format("%.2f", circle.getArea()));
                        System.out.println("Keliling lingkaran: " + String.format("%.2f", circle.getPerimeter()));
                    }
                    else if (selectedShape instanceof Rectangle) {
                        Rectangle rectangle = (Rectangle) selectedShape;
                        System.out.println("Luas persegi panjang: " + rectangle.getArea());
                        System.out.println("Keliling persegi panjang: " + rectangle.getPerimeter());
                    }
                    else if (selectedShape instanceof Square) {
                        Square square = (Square) selectedShape;
                        System.out.println("Luas persegi: " + square.getArea());
                        System.out.println("Keliling persegi: " + square.getPerimeter());
                    }
                    else{
                        System.out.println("Shape dasar tidak memiliki luas/keliling!");
                    }
                break;
                case 5 :
                    System.out.println("Terima Kasih Telah Menggunakan Program");
            break;
            default:
                    System.out.println("Pilihan tidak valid!");
        } 
    }
        while (pilihan != 5); 
        scanner.close(); 
}           
}