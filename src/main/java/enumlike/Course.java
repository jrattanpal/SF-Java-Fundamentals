package enumlike;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Course {
  static {
    System.out.println("Loading course classs");
  }
  // Java's Map type is equivalent to Python's dict...
  private static Map<String, Course> pool = new HashMap<>();

  private String id;
  private String description;

  private Course(String id, String description) {
    this.id = id;
    this.description = description;
  }

  public static Course newCourse(String id, String description) {
    // VALIDATION ELIDED!!!!

    Course newCourse = pool.get(id);
    if (newCourse != null) {
      throw new IllegalArgumentException("Course already exists!");
    }
    newCourse = new Course(id, description);
    pool.put(id, newCourse);
    return newCourse;
  }

  public static Course getCourse(String id) {
    Course course = pool.get(id);
    if (course == null) {
      throw new IllegalArgumentException("No such course");
    }
    return course;
  }

  public static Collection<Course> getAll() {
    return pool.values();
  }

  @Override
  public String toString() {
    return "Course{" +
        "id='" + id + '\'' +
        ", description='" + description + '\'' +
        '}';
  }
}

class TryCourses {
  public static void main(String[] args) {
    Course.newCourse("ECON101", "Understanding the incomprehensible");
    Course.newCourse("MATH101", "Making others feel inadequate");
    Course c1 = Course.getCourse("MATH101");
    Course c2 = Course.getCourse("MATH101");
    System.out.println("c1 == c2? " + (c1 == c2));
//    Course.newCourse("MATH101", "Making others feel inadequate");
    Course.newCourse("MATH201", "Scaring onesself");

    for (Course c : Course.getAll()) {
      System.out.println(c);
    }
  }
}
