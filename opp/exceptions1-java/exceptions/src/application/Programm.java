package application;

import model.entities.Reservation;
import model.exceptions.DomainException;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {

            System.out.println("Room number:");
            int roomNumber = sc.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy):");
            Date checkInDate = sdf.parse(sc.next());

            System.out.println("Check-out date (dd/MM/yyyy):");
            Date checkOutDate = sdf.parse(sc.next());


            Reservation reservation = new Reservation(roomNumber, checkInDate, checkOutDate);
            System.out.println("Reservation: " +reservation);


            System.out.println("Enter the data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy):");
            checkInDate = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy):");
            checkOutDate = sdf.parse(sc.next());


            reservation.upDates(checkInDate, checkOutDate);
            System.out.println(reservation);



        } catch (ParseException e){
            System.out.println(e.getMessage());
        } catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e ){
            System.out.println("Unexpected error: " + e.getMessage());
        }



        }



    }



