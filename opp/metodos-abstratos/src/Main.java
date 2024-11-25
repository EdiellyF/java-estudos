import entities.Circle;
import entities.Reclangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int numerosFiguras = sc.nextInt();

        List<Shape> shapesList = new ArrayList<>();

        for (int i=0; i < numerosFiguras; i++){
            System.out.println("Shape #"+ (i+1) + "data: ");
            System.out.print("Rectangle or Circle(r/c)?");
            char type = sc.next().toUpperCase().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next().toUpperCase());

            Shape shape;
            if (type == 'R'){
                System.out.print("Width:");
                Double x = sc.nextDouble();
                System.out.print("Height:");
                Double y = sc.nextDouble();
                shape = new Reclangle(color, x, y);
            } else {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                shape = new Circle(color, radius);
            }

            shapesList.add(shape);
        }

        System.out.println("SHAPE AREAS:");
        shapesList.forEach(sp -> System.out.printf("%.2f%n", sp.area()));



        sc.close();
    }
}