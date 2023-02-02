package uselists;

import java.time.LocalDate;
import java.util.ArrayList;

public class Examples {
  public static void main(String[] args) {
    ArrayList al = new ArrayList(); // please don't write this!
    System.out.println(al);
    System.out.println(al.size());
    al.add("Hello");
    al.add("Goodbye");
    al.add(LocalDate.now());
    System.out.println(al);
    System.out.println(al.get(0));
    System.out.println(al.get(1));
    Object thing = al.get(1);
    if (thing instanceof LocalDate) {
      LocalDate ldThing = (LocalDate)thing;
      System.out.println(ldThing.getYear());
    } else {
      System.out.println("That wasn't a date...");
    }
    LocalDate ld = LocalDate.now();
    System.out.println("year is " + ld.getYear());
    System.out.println();
  }
}
