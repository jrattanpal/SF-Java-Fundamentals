package useenums;

enum Suit {
  SPADES, CLUBS, DIAMONDS, HEARTS;

  @Override
  public String toString() {
    return "I'm a suit " + name().toUpperCase();
  }

  public boolean isTrumps(Suit this) {
    return this == /*Suit.*/SPADES;
  }
}

public class ASolution {

  public static boolean isTrumps(Suit suit) {
    return Suit.SPADES == suit;
  }

  public static void main(String[] args) {
    System.out.println("is DIAMONDS trumps? "
        + isTrumps(Suit.DIAMONDS));
    System.out.println("is DIAMONDS trumps? "
        + isTrumps(Suit.SPADES));

    System.out.println("is SPADES trumps v2? "
    + Suit.SPADES.isTrumps());
    System.out.println("is SPADES trumps v2? "
    + Suit.DIAMONDS.isTrumps());
//    System.out.println("is BANANA trumps? " + isTrumps("BANANA"));
//    System.out.println("is BANANA trumps? " + isTrumps(new Suit()));

    System.out.println(Suit.valueOf("HEARTS") == Suit.HEARTS);
    Suit [] values = Suit.values();
    for (Suit s : values) {
      System.out.println("> " + s);
      System.out.println("is this one trumps? "
          + s.isTrumps());
    }

    String s = "Hello";
  }
}
