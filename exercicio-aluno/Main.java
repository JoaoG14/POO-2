import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome do aluno: ");
        String name = sc.nextLine();
        
        System.out.println("Digite as três notas do aluno:");
        double grade1 = sc.nextDouble();
        double grade2 = sc.nextDouble();
        double grade3 = sc.nextDouble();
        
        Student student = new Student(name, grade1, grade2, grade3);
        
        System.out.println();
        System.out.println(student);
        
        sc.close();
    }
} 