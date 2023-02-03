package filesandexceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Example1 {
  public static void main(String[] args)
      throws FileNotFoundException, IOException {
    FileReader fr = new FileReader("data.txt");
    // BufferedReader provides readLine :)
    // see also Scanner.
    BufferedReader br = new BufferedReader(fr);
    String line;
    while ((line = br.readLine()) != null) {
      System.out.println(">>>> " + line);
      // Pattern provides for complex regular expressions
      // and matching/extracting from a piece of text

      String[] elements = line.split(",");
      System.out.println("parsed line, elements are "
          + Arrays.toString(elements));
    }
  }
}
