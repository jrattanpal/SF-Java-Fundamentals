package studentsbetter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// java has a package java.util.function,
// containing 43 "functional interfaces"
// Things taking args and returning a value are Function and variations
// things that take and argument and "swallow it" are Consumer
// Things that take no args and return something are Supplier
// Things that test something and get a boolean result are Predicate
@FunctionalInterface
interface StudentCriterion { // equivalent to Predicate<Student>
  boolean test(Student s);
//  void doStuff();
}

class SmartCriterion implements StudentCriterion {
  @Override
  public boolean test(Student s) {
    return s.getGpa() > 3;
  }
}

class EnthusiasticCriterion implements StudentCriterion {
  @Override
  public boolean test(Student s) {
    return s.getCourses().size() > 3;
  }
}

public class School {
  public static void showAllStudents(List<Student> ls) {
    for (Student s : ls) {
      System.out.println("> " + s);
    }
  }

//  public static void showAllSmartStudents(
//      List<Student> ls, double threshold) {
//    for (Student s : ls) {
//      if (s.getGpa() > threshold) {
//        System.out.println(">> " + s);
//      }
//    }
//  }

//  public static List<Student> selectSmartStudents(
//      List<Student> ls, double threshold) {
//    List<Student> res = new ArrayList<>();
//    for (Student s : ls) {
//      if (s.getGpa() > threshold) {
//        res.add(s);
//      }
//    }
//    return res;
//  }
//
//  public static List<Student> selectEnthusiasticStudents(
//      List<Student> ls, int threshold) {
//    List<Student> res = new ArrayList<>();
//    for (Student s : ls) {
//      if (s.getCourses().size() > threshold) {
//        res.add(s);
//      }
//    }
//    return res;
//  }

  // Command pattern: separate variable behavior and bring it
  // back to work with the rest as a method argument
  public static List<Student> selectStudents(
//      List<Student> ls, StudentCriterion crit) {
      List<Student> ls, Predicate<Student> crit) {
    List<Student> res = new ArrayList<>();
    for (Student s : ls) {
      if (crit.test(s)) {
        res.add(s);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    List<Student> roster = List.of(
        Student.of("Fred", 3.2, "Math", "Physics"),
        Student.of("Jim", 2.2, "Journalism"),
        Student.of("Sheila", 3.9,
            "Math", "Physics", "Quantum Mechanics", "Astrophysics")
    );

    // print all students
    showAllStudents(roster);
    System.out.println("------------");
//    showAllStudents(selectSmartStudents(roster, 3.0));
//    System.out.println("------------");
//    showAllStudents(selectSmartStudents(roster, 3.5));
//    System.out.println("------------");
//    showAllStudents(selectEnthusiasticStudents(roster, 3));

//    showAllStudents(selectStudents(roster, new SmartCriterion()));
//    System.out.println("------------");
//    showAllStudents(selectStudents(roster, new EnthusiasticCriterion()));
//    System.out.println("------------");
    showAllStudents(selectStudents(roster,
//        (Student s) -> { return s.getGpa() < 3;}
//        (s) -> { return s.getGpa() < 3;}
//        s -> { return s.getGpa() < 3;}
        s -> s.getGpa() < 3
        ));
  }
}
