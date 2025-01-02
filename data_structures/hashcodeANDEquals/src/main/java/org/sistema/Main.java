package org.sistema;

import entities.Client;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Criando clientes
        Client client1 = new Client("João","joao@example.com");
        Client client2 = new Client("João","joao@example.com");

        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());
        System.out.println("Os clientes são iguais? " + client1.equals(client2));

    }
}