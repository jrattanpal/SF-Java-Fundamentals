package studentsbetter;

import java.util.List;

public class Student {
  private String name;
  private double gpa;
  private List<String> courses;

  private Student(String name, double gpa, List<String> courses) {
    this.name = name;
    this.gpa = gpa;
    this.courses = courses;
  }

  public static Student of(String name, double gpa, String ... courses) {
    return new Student(name, gpa, List.of(courses));
  }

  public String getName() {
    return name;
  }

  public double getGpa() {
    return gpa;
  }

  public List<String> getCourses() {
    // because courses is a List.of, it's not modifiable
    // that means the caller of this cannot say e.g.
    // stud.getCourses().add("blah");
    // therefore I have not failed to create an unmodifiable student
    return courses;
  }

  public Student withName(String name) {
    // it's safe to share "this.courses" BECAUSE it's immutable
    return new Student(name, this.gpa, this.courses);
  }

  public Student withGpa(double gpa) {
    return new Student(this.name, gpa, this.courses);
  }

  public void setCourses(List<String> courses) {
    this.courses = courses;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", gpa=" + gpa +
        ", courses=" + courses +
        '}';
  }
}
