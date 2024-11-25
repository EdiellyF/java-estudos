package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private String name;
    private String email;
    private Date birthDate;

    public Client(String name, String email, String birthDate) {
        this.name = name;
        setEmail(email);
        setBirthDate(birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            this.birthDate = df.parse(birthDate);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "Client: " + " " + name  + "(" + birthDate + ") - "+ email;
    }
}
