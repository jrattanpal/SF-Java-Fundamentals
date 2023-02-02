package uselists;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class DifferentLists {
  public static void showAll(List<String> ls) {
    for (String s : ls) {
      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    List<String> als = new ArrayList<>();
//    List<String> als = new LinkedList<>();
    als.add("Fred");
    als.add("Jim");
    als.add("Sheila");
    showAll(als);

//    List<String> lls = new LinkedList<>();
//    lls.add("Fred");
//    lls.add("Jim");
//    lls.add("Sheila");
//    showAll(lls);

  }

}
