package useenums;

class ASuit { // can do this by hand... but not in this class :)
}

public class TheProblem {

  public static boolean isTrumps(String suit) {
//  public static boolean isTrumps(Suit suit) {
//    if (suit.equals("SPADES"))
//    return "SPADES".equals(suit);
    return "SPADES" == suit;
  }

  public static void main(String[] args) {
    System.out.println("is DIAMONDS trumps? " + isTrumps("DIAMONDS"));
    System.out.println("is DIAMONDS trumps? "
        + isTrumps("SPADES".toUpperCase()));
    System.out.println("is DIAMONDS trumps? "
        + isTrumps("spades".toUpperCase()));
//    System.out.println("is BANANA trumps? " + isTrumps("BANANA"));
//    System.out.println("is BANANA trumps? " + isTrumps(new Suit()));
  }
}
