package org.sistema;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        Set<Number> a = LeitorLista(sc, n);

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        Set<Number> b = LeitorLista(sc, n);


        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        Set<Number> c = LeitorLista(sc, n);

        Set<Number> total = new HashSet<>();
        total.addAll(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());

        sc.close();
    }

    public static Set<Number> LeitorLista(Scanner sc, int n) {
        Set<Number> s = new HashSet();
        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }
        return s;
    }


}