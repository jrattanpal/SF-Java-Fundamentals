package school;

import students.Student;

public class UseStudent {
  public static void main(String [] args) {
    Student s = new Student();
    System.out.println(s.name);
    System.out.println(s.gpa);

    s.name = "Fred";
    System.out.println(s.name);
    s.name = "Frederick";
    System.out.println(s.name);

  }
}

//class UseAnotherStudent {
//  public static void main(String[] args) {
//    System.out.println("Hellooo!!!");
//  }
//}

