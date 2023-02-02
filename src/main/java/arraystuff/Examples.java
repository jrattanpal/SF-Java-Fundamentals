package arraystuff;

import java.util.Arrays;

public class Examples {
//  public static void showAll(int [] values) {
  // varargs must be the LAST item in the param list
  public static void showAll(int ... values) {
    for (int v : values) {
      System.out.println("+-+> " + v);
    }
  }

  public static void main(String[] args) {
//    int [] ia = new int[3]; // three zero values
    int [] ia = {99, 98, 97};
    System.out.println(ia[0]);
    ia[1] = 99;
    System.out.println(ia[1]);
    System.out.printf("ia has %d elements\n", ia.length);

//    System.out.println(java.util.Arrays.toString(ia));
    System.out.println(Arrays.toString(ia));
    int target = ia.length + 1;
    int [] ia2 = new int[ia.length + 2];
    System.arraycopy(ia, 0, ia2, 0, ia.length);
    ia = ia2; // replaces the reference in ia with a reference to the new array
    ia[target] = 100;
    System.out.println(Arrays.toString(ia));
//    System.out.println(ia[-1]);

    int [][] iaa = {
        {1, 2, 3,},
        {4,},
        {5, 6, 7, 8, 9,},
    };
    System.out.println(iaa.length);
    System.out.println(iaa[0].length);
    System.out.println(iaa[1].length);

    int counter = 0;
    // tests in Java must be real boolean expressions
    // not concept of "truthy/falsy"
    while (counter < ia.length) {
      System.out.println("> " + ia[counter]);
      counter++;
    }
    System.out.println("--------------");
    for (int c2 = 0; c2 < ia.length; c2++) {
      int x = 99;
      System.out.println("> " + ia[c2]);
    }
//    System.out.println(c2); // c2 now out of scope
    int res = counter + 1; // expression must be assigned
    int r2 = counter++; // "statement expression" need not be assigned
    counter++; // "statement expression" need not be assigned
    System.out.println("--------------");
    counter = 0;
    do {
      System.out.println(">>> " + ia[counter++]);
    } while (counter < ia.length);
    System.out.println("--------------");
    for (int x : ia) { // works for arrays and all "Iterables"
      // this does NOT give access to any "index" notion
      System.out.println("+++ " + x);
    }
    System.out.println("--------------");
    showAll(ia);
    System.out.println("--------------");
//    showAll({9,8,7}); // NOPE!!!
    showAll(new int[]{9,8,7});
    System.out.println("--------------");
    showAll(1,2,3,4);
  }
}
