package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
  public static void readFile(String fn)
//      throws FileNotFoundException
  {
    try {
      FileReader fr = new FileReader(fn);
    } catch (FileNotFoundException fnfe) {
      // retry??
      // if out of retries, rethrow?

      // YUK! Runtime stuff is Spring behvior
      throw new RuntimeException(fnfe);
    }
  }

  public static void main(String[] args) {
    try {
      readFile("data.txt");
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
  }
}
