package entities;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class UserDataLog  {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");

    private String name;
    private ZonedDateTime date;

    public UserDataLog(String name, String date) {
          setName(name);
          setDate(date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getDate() {


        return date;
    }

    public void setDate(String date) {
        try {
                this.date = ZonedDateTime.parse(date, formatter);
            }
         catch (DateTimeParseException e) {
             System.err.println("Formato de data inválido. Use o padrão esperado: yyyy-MM-dd'T'HH:mm:ssZ");
             throw new IllegalArgumentException("Data inválida: " + date, e);
        }

    }





}
