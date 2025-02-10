import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual o valor do dólar? ");
        double dollarPrice = sc.nextDouble();
        
        System.out.print("Quantos dólares serão comprados? ");
        double dollarAmount = sc.nextDouble();
        
        double result = CurrencyConverter.convertDollarToReal(dollarPrice, dollarAmount);
        
        System.out.printf("Valor a ser pago em reais = %.2f%n", result);
        
        sc.close();
    }
} 