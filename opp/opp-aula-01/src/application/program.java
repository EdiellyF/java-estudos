package application;
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);


        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of Triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of Triangle X:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

       System.out.println(x.calcularArea());
       System.out.println(y.calcularArea());

       String area_maior = (y.area > x.area ) ?  "Y" : "X";

       System.out.println("Larger area: " + area_maior);
    }
}
