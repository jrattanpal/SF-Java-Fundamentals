package filesandexceptions;

import java.io.*;

public class ClosingFileRight {
  public static void main(String[] args) {
    try ( // "resources" must implement the interface "AutoCloseable"
        FileReader fr = new FileReader("data.txt");
        FileWriter fw = new FileWriter("output.txt");)
    {
      BufferedReader br = new BufferedReader(fr);
      PrintWriter pw = new PrintWriter(fw);

      String line;
      while ((line = br.readLine()) != null) {
        pw.println(line);
      }
    } catch (IOException ioe) {
      System.out.println("Something broke... "
          + ioe.getMessage());
    }
  }
}

/*
1) Complete your Student class (private fields, constructor, varags courses)
   - initialize using a factory?
   - perhaps (knowing it's a bad choice!) represent courses using enums
   - (harder :) represent courses using a factory mechanism that emulates
     runtime-extensible enums
2) Create a sub-type of student called "VIPStudent"
   - add a VIPStudent to your list of students
   - VIPStudent gets:
     a) Fancy printout
     b) 20% rise in grade
   - IF you created a factory for your Student, modify that factory
     to return a VIPStudent rather than regular student if ***some criterion**
     is met
3) Initialize your list of students from text in a file

 */