package mutabledate;

public class Date {
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year) {
    // validate (should be better than this)
//    if (day < 1 || day > 31 || month < 1 || month > 12) {
    if (isValidDate(day, month, year)) {
      throw new IllegalArgumentException("Bad date values");
    }
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public static int getDay(Date d) {
    return d.day;
  }

  public static void setDay(Date d, int day) {
//    if (day < 1 || day > 31) {
    if (isValidDate(day, d.month, d.year)) {
      throw new IllegalArgumentException("Bad day");
    }
    d.day = day;
  }

  public static boolean isValidDate(int day, int month, int year) {
    return day > 0 && day <= daysInMonth(month, year)
        && month > 0 && month <= 12;
  }

  public static void tomorrow(Date d) {
    int tentativeDay = d.day + 1;
    //if (tentativeDay > days in month...)
    // start next month -- did we wrap around a year!?
//    d.day = d.day + 1;
//    d.day += 1;
    d.day++;
  }

  public static final int [] dayCount =
//      new int[12];
//      new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
      { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  public static int daysInMonth(int month, int year) {
    if (month < 1 || month > 12) {
      throw new IllegalArgumentException("Bad month!");
    }
    if (month == 2) return isLeapYear(year) ? 29 : 28;
    return dayCount[month - 1];
  }


//  public static int daysInMonth(int month, int year) {
//    // also consider "assert" -- Java keyword for INTERNAL integrity checks
//    if (month < 1 || month > 12) {
//      throw new IllegalArgumentException("Bad month!");
//    }
//    // Current LTS versions of Java can switch on:
//    // numbers int or smaller
//    // String, enums
//    switch (month) {
//      case 9:
//      case 4:
//      case 6:
//      case 11:
//        return 30; // return jumps out of the method
//      // OTHERWISE WE NEED break;
//      case 2:
//        return isLeapYear(year) ? 29 : 28;
//      default:
//        return 31;
//      // If using Java 14 or newer
//      // LEARN ABOUT THE ARROW SYNTAX, and commas for "alternation"
//    }
//  }

//  public static int daysInMonth(int month, int year) {
//    // also consider "assert" -- Java keyword for INTERNAL integrity checks
//    if (month < 1 || month > 12) {
//      throw new IllegalArgumentException("Bad month!");
//    }
//    if (month == 9 || month == 4 || month == 6 || month == 11) {
//      return 30;
//    } else if (month == 2) {
//      return isLeapYear(year) ? 29 : 28;
//    } else {
//      return 31;
//    }
//  }
//
  public static boolean isLeapYear(int year) {
    // Java % is REMAINDER NOT MOD
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }
}

class UseDate {
  public static void main(String[] args) {
    Date d = new Date(1, 2, 2023);
    System.out.println("day is " + d);
    System.out.println("day is " + Date.getDay(d));
    Date.setDay(d, Date.getDay(d) + 1);
    Date.tomorrow(d);
    System.out.println("day is " + Date.getDay(d));
  }
}

// Students should always have a name.
// name == null -> BAD
// name.length() == 0 -> BAD
// validate "grade" according to your cultural conventions

// IF FINISHED, RAISE HAND
