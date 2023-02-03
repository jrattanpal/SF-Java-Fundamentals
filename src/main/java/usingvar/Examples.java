package usingvar;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Examples {
//  var name = "Albert"; // NOPE, not for object/class fields

  public static Map<List<String>, Map.Entry<LocalDate, Set<ZonedDateTime>>> getComplexStuff() {return null;}
  public static void main(String[] args) {
//    int x = 99;
    var x = 99;
//    x = "Nope"; // NOT dynamic typing...

//    String s = "Hello";
    var s = "Hello";
//    Map<List<String>, Map.Entry<LocalDate, Set<ZonedDateTime>>> thing = getComplexStuff();
    var thing =
        getComplexStuff();
//    var t;
//    t = LocalDate.now();

    var ia = new int[9];
//    var ia = new int[]{};
//    var ia = {}; // NOPE, not this form!
  }
}
