package org.sistema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);

        List<Object> myObjs = new ArrayList<Object>();



        copy(myInts, myObjs);

        System.out.print(""+ myObjs.get(0));
        print(myObjs);


        copy(myDoubles, myObjs);
        System.out.println(";");
        print(myObjs);

    }

    public static void copy(List<? extends  Number> source, List<? super Number> destination) {
        for (Number number : source) {
            destination.add(number.doubleValue());
        }
    }

    public static void print(List<?> list) {


        for (Object obj : list) {
            System.out.print(obj + " ");
        }
    }
}