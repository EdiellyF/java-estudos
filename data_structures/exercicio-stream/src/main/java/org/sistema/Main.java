package org.sistema;

import entities.Employee;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path:");
        String path = sc.nextLine();

        List<Employee> employees = new ArrayList<Employee>();


        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                Employee employee = new Employee(fields[0], fields[1], Double.parseDouble(fields[2]));
                employees.add(employee);
            }

            System.out.print("Enter salary:");
           double salaryReference = sc.nextDouble();

            System.out.println("Email of the employee whose salary is more than " + salaryReference + ":");

            List<String> emails = employees.stream()
                    .filter(e -> e.getSalary() > salaryReference)
                    .map(Employee::getEmail)
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            System.out.println("Enter the start letter of name");
            String startLetter = sc.next().trim().toUpperCase();

            String finalStartLetter = startLetter;
            Double soma = employees.stream()
                    .filter(e -> e.getName().trim().toLowerCase().startsWith(startLetter) )
                    .mapToDouble(Employee::getSalary)
                    .sum();

            if(soma != 0.0){
                System.out.printf(" Sum of salary of people whose name starts with %s: %.2f%n " ,startLetter, soma);
            } else {
                System.out.printf("No have people whose name starts with %s:" ,startLetter);
            }




        }catch (IOException e){
            e.printStackTrace();
        }


    }
}