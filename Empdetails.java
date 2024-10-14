public class Empdetails{
//attributes
  int id;  
  String firstName;
  String lastName;
  int salary;   

//constructor
  public Empdetails(int id, String firstName, String lastName, int salary){
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }
//getter for id
  public int getId(){
    return id;
  }

  //setter for id
  public void setId(int id){
    this.id = id;
  }

  //getter for firstName
  public String getFirstName(){
    return firstName;
  }

  //setter for firstName
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  //getter for lastName
  public String getLastName(){
    return lastName;
  }

  //setter for lastName
  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  //getter name
  public String getName(){
    return firstName + " " + lastName;
  }

  //getter for salary
  public int getSalary(){
    return salary;
  }

  //setter for salary
  public void setSalary(int salary){
    this.salary = salary;
  }

  //getter AnnualSalary
  public int getAnnualSalary(){
    return salary * 12;
  }
  //raise salary int percent
  public void raiseSalary(int percent){
    salary = salary + (salary * percent / 100);
  }
  //toString method
  public String toString(){
    return "Employee ID: " + id + "\nName: " + getName() + "\nSalary: " + salary;
  }
}