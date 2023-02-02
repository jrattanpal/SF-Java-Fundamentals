package equivalence;

import java.util.ArrayList;

public class Examples {
  public static void main(String[] args) {
    int x = 99;
    int y = 99;
    int z = 100;
    System.out.println(x == y);
    System.out.println(x == z);

    String s1 = new String("Hello");
    String s2 = new String("Hello");
    String s3 = new String("Goodbye");
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println("s1.equals(s2) " + s1.equals(s2));
    System.out.println("s1.equals(s3) " + s1.equals(s3));

    Object obj = s1;
    if (obj instanceof String) {
      String s4 = (String)obj;
      System.out.println("instanceof passed, s1 == s4 " + (s1 == s4));
      System.out.println("obj == s4 " + (obj == s4));
    }
//    Object odd = 1;
//    Object odd = Integer.valueOf(1);
    String s5 = s1.toUpperCase();
    System.out.println(s1);
    s1 = s1.toUpperCase();
    System.out.println(s1);
    System.out.println(s5);
    System.out.println(s1 == s5);

//    StringBuilder sb1 = new StringBuilder("Hello");
//    StringBuilder sb2 = new StringBuilder("Hello");
    Object sb1 = new StringBuilder("Hello");
    Object sb2 = new StringBuilder("Hello");
    System.out.println(sb1 == sb2);
    System.out.println("sb1.equals(sb2) " + sb1.equals(sb2));

    ArrayList<String> als = new ArrayList<>();
    als.add("Fred"); als.add("Jim"); als.add("Sheila");
    System.out.println(als.contains("Albert"));
    System.out.println(als.contains("Fred"));


    String st1 = "Hello";
    String st2 = "Hello";
    System.out.println(st1 == st2);



  }
}
