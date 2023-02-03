package enumlike;

import org.junit.Assert;
import org.junit.Test;

public class TestCourse {

  // THIS IS NOT TRULY VALID!!!!
  // because we store static data, in the unit under test,
  // this stuff fails if the order of test execution is "wrong".

  @Test
  public void coursesShouldBeEmptyInitially() {
    Assert.assertEquals("Initially should be empty",
        0, Course.getAll().size());
  }

  @Test
  public void addingCourseWorks() {
    Course.newCourse("ECON101", "How the world works");
    Course c1 = Course.getCourse("ECON101");
    Assert.assertEquals("Created course should be discoverable",
        c1, Course.getCourse("ECON101"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void addingTwiceShouldReject() {
    System.out.println("adding ECON101");
    Course.newCourse("ECON101", "How the world works");
    System.out.println("adding ECON101 again");
    Course.newCourse("ECON101", "How the world works");
  }
}
