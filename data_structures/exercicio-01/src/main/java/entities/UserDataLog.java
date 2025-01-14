package entities;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class UserDataLog implements Comparable<UserDataLog>, Serializable {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX");

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
        } catch (DateTimeParseException e) {
            System.err.println("Formato de data inválido. Use o padrão esperado: yyyy-MM-dd'T'HH:mm:ssZ");
            throw new IllegalArgumentException("Data inválida: " + date, e);
        }

    }


    @Override
    public String toString() {
        return "UserDataLog{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }


    @Override
    public int compareTo(UserDataLog o) {
        return getName().compareTo(o.getName());
    }
}






