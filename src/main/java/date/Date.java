package date;

import java.time.LocalDate;

public class Date {
  // private in Java "accessible only within the enclosing top-level
  // curly braces surrounding the declaration
  // Java allows classes (types generally) to be declared INSIDE
  // other classes / types
//  class InnerClass {
//    private int value;
//    // value is fully accessible inside any
//    // code of the Date class
//    // code here has access to day, month, and year
//  }
  private /*final*/ int day;
  private /*final*/ int month;
  private /*final*/ int year;

  // default constructor ONLY if Zero coded constructors:
//  public Date() {
//
//  }
//  public Date() {
//    this.day = 1;
//    this.month = 1;
//    this.year = 1970;
//  }

//  public static void init(Date d, int day, int month, int year) {
  // called a "constructor" but is really an "initialzier"
  // the object created by "new" appears (as if by magic)
  // as an implicit argument/parameter called "this"
  public Date(int day, int month, int year) {
    // validate (should be better than this)
    if (day < 1 || day > 31 || month < 1 || month > 12) {
      throw new IllegalArgumentException("Bad date values");
    }
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public static int getDay(Date d) {
    return d.day;
  }

  public static Date withDay(Date d, int day) {
    if (day < 1 || day > 31) {
      throw new IllegalArgumentException("Bad day");
    }
    return new Date(day, d.month, d.year);
  }

  public static Date tomorrow(Date d) {
    int tentativeDay = d.day + 1;
    //if (tentativeDay > days in month...)
      // start next month -- did we wrap around a year!?
    return new Date(d.day + 1, d.month, d.year);
  }
}

class UseDate {
  public static void main(String[] args) {
//    Date d = new Date();
//    Date.init(d, 32, 2, 2023);
    // function/method/constructor arguments are actually "expressions",
    // not merely "values"
    // expressions can be:
    // literal value, e.g. 1
    // variable
    // function/method/constructor
    // computation involving any other expressions and operators
    int theDay = 4;
    Date d = new Date(theDay + 2, 2, 2023);
    System.out.println("day is " + d);
//    System.out.println("day is " + d.day);
    System.out.println("day is " + Date.getDay(d));
    Date tomorrow = Date.withDay(d, Date.getDay(d) + 1);
    System.out.println("day is " + Date.getDay(d));
    System.out.println("tomorrow day is " + Date.getDay(tomorrow));

//    System.out.println("month is " + d.month);
//    Date d1 = new Date(0, 0, 0);

//    d.day = 1024;
//    System.out.println("day is " + d.day);


// NOPE, no accessible constructor in modern APIS
//    LocalDate ld = new LocalDate(1, 2, 2023);
//    LocalDate ld = LocalDate.of(2023, 2, 3);
//    System.out.println(ld);

    // 1) immutable data!
    // 2) protecting against invalid change

  }
}