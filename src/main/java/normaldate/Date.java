package normaldate;

public class Date {
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year) {
    if (!isValidDate(day, month, year)) {
      throw new IllegalArgumentException("Bad date values");
    }
    this.day = day;
    this.month = month;
    this.year = year;
  }

//  public static int getDay(Date d) {
//  public /*static*/ int getDay(Date this) {
//  public int getDay(/*@WithinThreeYears Date this*/) { // implicit this...
  public int getDay() { // implicit this...
//    return this.day;
    return day;
  }

//  public static void setDay(Date d, int day) {
//  public void setDay(Date this, int day) {
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

//  public static void tomorrow(Date d) {
  public void tomorrow(/*Date this*/) { // this is usually implicit...
    int tentativeDay = this.day + 1;
    //if (tentativeDay > days in month...)
    this.day++;
  }

  public static final int [] dayCount =
      { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  public static int daysInMonth(int month, int year) {
//    Date d = new Date(1,1,1);
//    d.day = 99;
    if (month < 1 || month > 12) {
      throw new IllegalArgumentException("Bad month!");
    }
    if (month == 2) return isLeapYear(year) ? 29 : 28;
    return dayCount[month - 1];
  }

  public static boolean isLeapYear(int year) {
    // Java % is REMAINDER NOT MOD
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }
}

class UseDate {
  public static void main(String[] args) {
    Date d = new Date(1, 2, 2023);
    System.out.println("day is " + d);
//    System.out.println("day is " + Date.getDay(d));
    System.out.println("day is " + d.getDay());
//    Date.setDay(d, Date.getDay(d) + 1);
    d.setDay(d.getDay() + 1);
    d.tomorrow();
    System.out.println("day is " + d.getDay());
//    d = null;
//    d.getDay(); // crashes without calling the method
  }
}
