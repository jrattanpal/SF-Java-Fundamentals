package singleton;

import java.util.ArrayList;
import java.util.List;

class Utils {
//  public static int upperLimit = 100;
//  public static int lowerLimit = 25;
  public int upperLimit = 100;
  public int lowerLimit = 25;
  private Utils() {}
  private static Utils theSingleton = new Utils();
  public static Utils get() {
    return theSingleton;
//    return new Utils();
  }
}

public class Examples {
  public static void doOneThing(int x) {
    Utils myUtils = Utils.get();
    if (x > myUtils.lowerLimit && x < myUtils.upperLimit) {
      System.out.println("Doing the one thing!!");
    }
  }
  public static void doAnotherThing(int x) {
    Utils myUtils = Utils.get();
    if (x < myUtils.lowerLimit) {
      System.out.println("That's too small doing some recovery!!");
    }
  }
//  public static void doOneThing(int x, Utils myUtils) {
//    if (x > myUtils.lowerLimit && x < myUtils.upperLimit) {
////    if (x > Utils.lowerLimit && x < Utils.upperLimit) {
//      System.out.println("Doing the one thing!!");
//    }
//  }
//  public static void doAnotherThing(int x, Utils myUtils) {
//    if (x < myUtils.lowerLimit) {
////    if (x < Utils.lowerLimit) {
//      System.out.println("That's too small doing some recovery!!");
//    }
//  }
  public static void main(String[] args) {
    List<Object> lo = new ArrayList<>();
//    Utils myUtils = new Utils();
//    Utils myUtils2 = new Utils();
    Utils myUtils = Utils.get();
    Utils myUtils2 = Utils.get();
    System.out.println("myUtils == myUtils2 ? " + (myUtils == myUtils2));

    lo.add(myUtils);
//    doOneThing(30, myUtils);
    doOneThing(30);
    myUtils.lowerLimit = 0;
//    doOneThing(10, myUtils2);
    doOneThing(10);
  }
}
