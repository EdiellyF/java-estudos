package entities;


public class Triangle {
    
    public double a;
    public double b;
    public double c;
    public Double area;
    private Double p;


    public  Double calcularArea(){
            this.p = ((this.a + this.b + this.c )/2);
            this.area = Math.sqrt(this.p*(this.p - this.a) * (this.p - this.b) * (this.p - this.c));
            return this.area;
    }
}
