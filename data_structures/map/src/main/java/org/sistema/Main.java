package org.sistema;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, String> feiticos = new HashMap<>();

        // Adicionando feitiços ao mapa
        feiticos.put("Catarina", "Feitiço da Visão");
        feiticos.put("Lúcia", "Feitiço do Vento");
        feiticos.put("Ana", "Feitiço do Fogo");

        // Consultando o feitiço de Lúcia
        System.out.println("O feitiço de Lúcia é: " + feiticos.get("Lúcia"));

        System.out.println(feiticos.keySet()); //[Ana, Catarina, Lúcia]
        System.out.println(feiticos.values()); // [Feitiço do Fogo, Feitiço da Visão, Feitiço do Vento]

        for (Map.Entry<String, String> entry : feiticos.entrySet()) {
            System.out.println(entry.getKey() + " tem o " + entry.getValue());
        }

        
    }
}
