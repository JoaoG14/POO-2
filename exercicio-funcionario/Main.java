import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String name = sc.nextLine();
        
        System.out.print("Salario bruto: ");
        double grossSalary = sc.nextDouble();
        
        System.out.print("Imposto: ");
        double tax = sc.nextDouble();
        
        Employee employee = new Employee(name, grossSalary, tax);
        
        System.out.println();
        System.out.println("Funcionario: " + employee);
        
        System.out.println();
        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double percentage = sc.nextDouble();
        
        employee.increaseSalary(percentage);
        
        System.out.println();
        System.out.println("Dados atualizados: " + employee);
        
        sc.close();
    }
} 