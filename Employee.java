public class Employee{
public static void main(String[] args){
    Empdetails emp1 = new Empdetails(1, "Peter", "Doe", 50000);
    System.out.println(emp1.toString());

    System.out.println("Annual Salary of Emp1: " + emp1.getAnnualSalary());
    emp1.raiseSalary(10);
    
    System.out.println("Updated Annual Salary of Emp1: " + emp1.getAnnualSalary());


}
}