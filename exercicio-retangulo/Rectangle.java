public class Rectangle {
    private double width;
    private double height;
    
    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    // Methods
    public double area() {
        return width * height;
    }
    
    public double perimeter() {
        return 2 * (width + height);
    }
    
    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
} 