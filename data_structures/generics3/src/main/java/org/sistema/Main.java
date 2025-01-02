package org.sistema;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<Shape> list = new ArrayList<Shape>();

        System.out.println("Enter the width of rectangle");
        double width = sc.nextDouble();

        System.out.println("Enter the height of rectangle");
        double height = sc.nextDouble();

        Rectangle rect = new Rectangle(width, height);
        list.add(rect);

        System.out.println("Enter the radius of circle");
        double radius = sc.nextDouble();
        list.add(new Circle(radius));


        System.out.println(totalArea(list));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.3));
        myCircles.add(new Circle(4.5));

        totalArea(myCircles);



    }

    public static double totalArea(List<? extends  Shape> list){
        double soma = 0.0;
        for (Shape shape : list){
          soma +=  shape.area();
       }
        return soma;
    }
}