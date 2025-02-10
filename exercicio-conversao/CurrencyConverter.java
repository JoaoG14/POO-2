public class CurrencyConverter {
    public static final double IOF = 0.06;
    
    public static double convertDollarToReal(double dollarPrice, double dollarAmount) {
        double dollarTotal = dollarPrice * dollarAmount;
        return dollarTotal + (dollarTotal * IOF);
    }
} 