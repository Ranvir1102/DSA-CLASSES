package OOPS;


class Employee{
  public String employeeName;
  private int employeeId;
  private double salary;

  public void setSalary(double salary){
    if(salary>=15000){
      this.salary = salary;
    }else{
      System.out.println("salary cannot be less than 15000");
    }
  }
  public double getSalary(){
    return salary;
  }
  public void setEmployeeId(int employeeId){
    this.employeeId = employeeId;
  }
  public int getEmployeeId(){
    return employeeId;
  }
}




public class Emp_loyee {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.employeeName = "Ranvir";

        emp.setEmployeeId(101);

        emp.setSalary(25000);

        System.out.println("Employee Name: " + emp.employeeName);

        System.out.println("Employee ID: " + emp.getEmployeeId());

        System.out.println("Salary: " + emp.getSalary());

    }

}