package mutabledate;

public class Date {
  private int day;
  private int month;
  private int year;

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

  public static void setDay(Date d, int day) {
    if (day < 1 || day > 31) {
      throw new IllegalArgumentException("Bad day");
    }
    d.day = day;
  }

  public static void tomorrow(Date d) {
    int tentativeDay = d.day + 1;
    //if (tentativeDay > days in month...)
    // start next month -- did we wrap around a year!?
//    d.day = d.day + 1;
//    d.day += 1;
    d.day++;
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
