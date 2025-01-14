package org.sistema;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface myInsteface {
    int multiplicarNumeros(int a, int b);
}

public class Program {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
   
       myInsteface referencia;
       referencia = (a, b) -> a * b;
       System.out.println(referencia.multiplicarNumeros(2, 3));
    }
}
