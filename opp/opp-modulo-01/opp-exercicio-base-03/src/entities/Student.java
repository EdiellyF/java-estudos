package entities;

import java.security.PublicKey;

public class Student {
    
    public String nome;
    public double n1, n2, n3;

    public double calcularNotaAluno(){
        return (n1 * 30 + n2  * 35 + n3 * 35)/ 100  * 3;
    }

    public double missingPoints(){
        if(calcularNotaAluno() < 60){
            return 60.0 - calcularNotaAluno();
        } else {
            return 0.00;
        }
    }




}
