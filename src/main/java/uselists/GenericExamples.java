package uselists;

import java.time.LocalDate;
import java.util.ArrayList;

public class GenericExamples {
  public static void breakMyList(ArrayList al) {
    al.add(1, LocalDate.now());
  }

  public static void main(String[] args) {
    ArrayList<LocalDate> ald = new ArrayList();
    ald.add(LocalDate.now());
    // oops!!! no check on RHS expression
//    ArrayList<String> al = new ArrayList(ald);
//    ArrayList<String> al = new ArrayList<String>(ald); // rejects :)
//    ArrayList<String> al = new ArrayList<>(ald); // rejects since Java 7 :)
    ArrayList<String> al = new ArrayList<>(); // rejects since Java 7 :)
    System.out.println(al);
    System.out.println(al.size());
    al.add("Hello");
    al.add("Goodbye");
//    al.add(LocalDate.now());
    System.out.println(al);
    System.out.println(al.get(0));
    System.out.println(al.get(1));
    breakMyList(al);
    String thing = al.get(0); // compiler generates the cast for us
    System.out.println(thing);
  }
}

// Day 2 lab 1
/*
IF you did not handle "several courses", do it now, using
ArrayList
If you did handle courses, optionally, handle them using
array or ArrayList, whichever you didn't use before...
Or: initialize your Student with a variable length arg list
of courses.
Or: whatever interests you!!!
 */