package org.sistema;

import entities.UserDataLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file full path:");
        String path = sc.nextLine();
        Set<UserDataLog> userLogs = new TreeSet<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] partesArquivo = line.split(" ");
                if(partesArquivo.length == 2) {
                    try {
                        UserDataLog userDataLog = new UserDataLog(partesArquivo[0], partesArquivo[1]);
                        userLogs.add(userDataLog);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                line = br.readLine();
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        if(!userLogs.isEmpty() ){
            System.out.println("Total Users:" + userLogs.size());
        }
        sc.close();
    }
}