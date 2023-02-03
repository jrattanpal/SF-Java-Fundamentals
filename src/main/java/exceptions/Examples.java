package exceptions;

public class Examples {
  public static void mightBreak() {
    int retries = 3;
    boolean success = false;
    while (!success && retries-- > 0) {
      System.out.println("trying");
      try {
        if (Math.random() > 0.2) {
          throw new IllegalStateException("Bwahahaa, that broke");
        }
        success = true;
      } catch (IllegalStateException ise) {
        System.out.println("oops, got ise: " + ise.getMessage());
        if (retries == 0) {
          throw ise;
        }
      }
    }
    System.out.println("mightBreak succeeded");
  }
  public static void main(String[] args) {
    System.out.println("starting");
    try {
      mightBreak();
      System.out.println("completed normally");
    } catch (Exception e) {
      System.out.println("oops, the call failed with: " + e.getMessage());
    }
    System.out.println("finishing program");
  }
}
