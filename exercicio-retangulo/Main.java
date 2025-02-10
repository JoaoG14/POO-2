import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com a largura e altura do retângulo:");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        
        Rectangle rect = new Rectangle(width, height);
        
        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETRO = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
        
        sc.close();
    }
} 