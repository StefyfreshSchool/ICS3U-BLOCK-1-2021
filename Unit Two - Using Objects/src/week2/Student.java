package week2;

public class Student {
  private String name;
  private String studentNumber;
  private int grade;

  public Student(String name, String studentNumber, int grade) {
    this.name = name;
    this.studentNumber = studentNumber;
    this.grade = grade;
  }

  public void displayName() {
    System.out.println(name);
  }

  public void displayStudentNumber() {
    System.out.println(studentNumber);
  }

  public void increaseGrade() {
    grade++;
  }

}
