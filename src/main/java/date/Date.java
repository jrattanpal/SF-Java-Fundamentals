package date;

public class Date {
  int day;
  int month;
  int year;
}

class UseDate {
  public static void main(String[] args) {
    Date d = new Date();
    System.out.println("day is " + d);
    System.out.println("day is " + d.day);
    System.out.println("month is " + d.month);
  }
}