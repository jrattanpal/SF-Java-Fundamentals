package uselists;

import java.util.ArrayList;

public class SpeedCheck {
  public static void insertMany(ArrayList<String> als, long count) {
    while (count-- > 0) {
      als.add("X");
    }
  }
  public static void main(String[] args) {
    ArrayList<String> als = new ArrayList<>();
    // Bother, keeps running out of memory
    // have to rethink this example :(
    long count = 1_000_000_000;
    long start = System.nanoTime(); // "micro benchmark" very untrustworthy!!!
    insertMany(als, count);
    long elapsed = System.nanoTime() - start;
    System.out.printf("completed in %7.3f\n", (elapsed / 1_000_000_000.0));
  }
}
