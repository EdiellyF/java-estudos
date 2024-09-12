package util;

public class CurrencyConverter {
    
    public static final double IOF = 0.06;


    public static double calcularDollar(double dollar, double buy){
        double valor =  buy * dollar;
        return dollar * buy * IOF + valor;
        
    }
}
