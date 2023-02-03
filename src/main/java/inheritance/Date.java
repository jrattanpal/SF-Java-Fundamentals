package inheritance;

public class Date {
  private int day;
  private int month;
  private int year;

  @Override
  public boolean equals(Object other) {
    if (other instanceof Date) {
      Date otherDate = (Date)other;
      return day == otherDate.day
          && month == otherDate.month
          && year == otherDate.year;
    } else {
      return false;
    }
  }

  public Date(int day, int month, int year) {
    if (!isValidDate(day, month, year)) {
      throw new IllegalArgumentException("Bad date values");
    }
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    if (!isValidDate(this.day, month, this.year)) {
      throw new IllegalArgumentException("Month doesn't work");
    }
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    if (!isValidDate(this.day, this.month, year)) {
      throw new IllegalArgumentException("Year doesn't work");
    }
    this.year = year;
  }

  public int getDay() {
    return day;
  }

  public void setDay(Date this, int day) {
    if (!isValidDate(day, this.month, this.year)) {
      throw new IllegalArgumentException("Bad day");
    }
    this.day = day;
  }

  public static boolean isValidDate(int day, int month, int year) {
    return day > 0 && day <= daysInMonth(month, year)
        && month > 0 && month <= 12;
  }

  public static final int [] dayCount =
      { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  public static int daysInMonth(int month, int year) {
    if (month < 1 || month > 12) {
      throw new IllegalArgumentException("Bad month!");
    }
    if (month == 2) return isLeapYear(year) ? 29 : 28;
    return dayCount[month - 1];
  }

  public static boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  @Override
  public String toString() {
    return String.format("Date: %d/%d/%d", day, month, year);
  }
}

// "inheritance" in Java is *single* inheritance, i.e. only one
// "parent type", only one named class after "extends"
//
class Holiday extends Date {
  private String name;
  public Holiday(int day, int month, int year, String name) {
    // argument evaluation must not refer, directly or indirectly
    // to "this". Also, (currently) super must come first (usually)
    super(day, month, year);
    this.name = name;
  }
  public Holiday(int day, int month, String name) {
    // if we use "this(...)" we MUST NOT use super(...)
    // this, must come first
    // circularity is detected and causes compilation failure :)
    this(day, month, 2023, name);
  }
  public String toString() {
    return String.format("Holiday on: %d/%d/%d called: %s",
        getDay(), getMonth(), getYear(), name);
  }
  public void celebrate() {
    System.out.println("Having a lovely time dancing and laughing "
    + " at our " + name + " party!");
  }
}

class UseDate {
  public static void showDate(Date d) {
    System.out.println("Date!! " + d);
  }
  public static void showDate(Holiday h) {
    System.out.println("Holiday!!! " + h);
  }
  public static void main(String[] args) {
    Date d = new Date(1, 2, 2023);
    System.out.println("day is " + d);

    Date nyd = new Holiday(1, 1, 2024, "New Year's Day");
    System.out.println(nyd.toString());
    showDate(nyd);
    System.out.println(nyd.getDay());

    Date d1 = new Date(1, 1, 2024);
    Date d2 = new Date(1, 1, 2024);
    System.out.println("d1 == d2 " + (d1 == d2));
    System.out.println("d1.equals(d2) " + (d1.equals(d2)));
    System.out.println("d1.equals(nyd) " + (d1.equals(nyd)));
    Object nydObj = nyd;
    System.out.println("d1.equals(nydObj) " + (d1.equals(nydObj)));


    // methods that we can compile are determined
    // by the TYPE OF THE REFERENCE EXPRESSION
    // the BEHAVIOR we get on invocation of an INSTANCE
    // method is determined by the TYPE OF THE OBJECT
//    nyd.celebrate();
  }
}
