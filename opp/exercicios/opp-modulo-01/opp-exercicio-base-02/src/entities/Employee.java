package entities;

public class Employee {
   public String Name;
   public double GrossSalary; 
   public double Tax;

   public double netSalary(){
        return this.GrossSalary - Tax;
   } 
   
   public void increaseSalary(double percentage){
        this.GrossSalary = (this.GrossSalary * percentage/100) + this.GrossSalary;
   }

   public String toString(){
      return Name + ", $" + netSalary();
   }

}
