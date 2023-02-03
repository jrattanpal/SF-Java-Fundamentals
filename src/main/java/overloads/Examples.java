package overloads;

import java.util.List;

public class Examples {
//  public static void doStuff(int a, int b) {
//    System.out.println("int, int");
//  }
  public static void doStuff(/*int b, */int ... a) {
    System.out.println("int ...");
  }
//  public static void doStuff(long a, long b) {
//    System.out.println("long, long");
//  }
//  public static void doStuff(long a, int b) {
//    System.out.println("long, int");
//  }
//  public static void doStuff(int a, long b) {
//    System.out.println("int, long");
//  }

//  public static void doStuff(Integer a, Integer b) {
//    System.out.println("Integer, Integer");
//  }

  public static void doStuff(List<Integer> li) {
    System.out.println("List<Integer>");
  }

  // NO, this is not different argument type sequence
  // the "generic type parameter", <Number> in this case
  // is NOT available at runtime, and not part of the
  // method name, so this is the SAME method as above!!!
//  public static void doStuff(List<Number> li) {
//    System.out.println("List<Number>");
//  }

  public static void main(String[] args) {
//    doStuff(9L, 10); // widening promotion if only int, int, and long, long
//    doStuff(9L, 10);

    // ambiguous promotion possibilities are rejected by compiler..
//    doStuff(9, 10);
    doStuff(9, 10);

    // java 9+ "unmodifiable List"
    doStuff(List.of(1, 2, 3));
  }
}
