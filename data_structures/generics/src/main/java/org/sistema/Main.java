package org.sistema;

import services.PrintService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("How many values?");
        int n = sc.nextInt();



        PrintService<String> ps = new PrintService<>();

      for (int i = 0; i < n; i++) {
          System.out.println("Enter " + i + ":");

          ps.addValue(sc.next());

      }



        ps.print();
        System.out.println("First: " + ps.first());







        sc.close();

    }
}