package OOPS;

 class Student {

  public String studentName;

  private int rollNumber;

  protected String course;

  String collegeName;

  public void setRollNumber(int rollNumber){
    this.rollNumber = rollNumber;
  }

  public int getRollNumber(){
    return rollNumber;
  }
  
}

public class student1{
  public static void main(String[] args){
    Student s1 = new Student();

    s1.studentName = "Ranvir";
    s1.setRollNumber(101);
    s1.course = "CSE";
    s1.collegeName = "KIT";

    System.out.println("student NAme : " + s1.studentName);
    System.out.println("course : " + s1.course);
    System.out.println("college : " + s1.collegeName);
    System.out.println("Roll Number : " + s1.getRollNumber());
  }
}
