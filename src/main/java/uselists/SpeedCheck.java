package uselists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Command line examples:
// compilation:
// javac -d myclasses -cp ~/.m2/repository/log4j/log4j/1.2.12/log4j-1.2.12.jar ./src/main/java/uselists/SpeedCheck.java
// execution:
// java -cp myclasses:~/.m2/repository/log4j/log4j/1.2.12/log4j-1.2.12.jar uselists.SpeedCheck
// maven often used, build (for example)
// mvn package
//
public class SpeedCheck {
  public static void insertMany(List<String> als, long count) {
    while (count-- > 0) {
      als.add("X");
      als.remove(1);
    }
  }

  public static void main(String[] args) {
//    List<String> als = new LinkedList<>();
    List<String> als = new ArrayList<>();
    for (int i = 0; i < 40_000; i++) {
      als.add("X");
    }
    long count = 10_000_000;
    long start = System.nanoTime(); // "micro benchmark" very untrustworthy!!!
    insertMany(als, count);
    long elapsed = System.nanoTime() - start;
    System.out.printf("completed in %7.3f\n", (elapsed / 1_000_000_000.0));
  }
}
