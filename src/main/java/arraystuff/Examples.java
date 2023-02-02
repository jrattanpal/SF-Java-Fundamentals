package arraystuff;

import java.util.Arrays;

public class Examples {
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
  }
}
