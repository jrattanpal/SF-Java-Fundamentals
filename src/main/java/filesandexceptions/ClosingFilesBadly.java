package filesandexceptions;

import java.io.*;

public class ClosingFilesBadly {
  public static void main(String[] args) throws IOException {
    FileReader fr = null;
    FileWriter fw = null;
    try {
      fr = new FileReader("data.txt");
      fw = new FileWriter("output.txt");
      BufferedReader br = new BufferedReader(fr);
      PrintWriter pw = new PrintWriter(fw);

      String line;
      while ((line = br.readLine()) != null) {
        pw.println(line);
      }
//    } catch (IOException ioe) {
//      System.out.println("oops, something broke");
    } finally {
//      pw.close(); // closes all "downstream" resources, i.e FileWriter
//      br.close();
      if (fw != null) {
        try {
          fw.close();
        } catch (IOException ioe) {
          // now what??
        }
      }
      if (fr != null) {
//        fr.close(); // catch this exception too!!!
      }
    }

  }
}
