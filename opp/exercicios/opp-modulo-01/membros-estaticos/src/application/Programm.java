package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;



public class Programm {
    
 
    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius:");
            double radius = sc.nextDouble();

        double c = Calculator.circuferencia(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumferencia : %.2f%n ",c);

        System.out.printf("Volume : %.2f%n",v);

        System.out.printf("PI: %.2f%n",Calculator.PI);
     
        sc.close();
    }
   
   

}
