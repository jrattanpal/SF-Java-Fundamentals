package textformat;

public class Example {
  public static String getMessage() {
    double d = Math.PI + 20_000_000_000L;
    int money = 212;
    String message = "Pi is %7.3f, and you have $%05d\n";
    return String.format(message, d, money);
  }
  public static void main(String[] args) {
    System.out.println(getMessage());
  }
}
