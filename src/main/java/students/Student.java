package students;

public class Student {
  {
    System.out.println("initializing... value of name is " + this.name);
  }
  // default access if no "public" or whatever
  // MOSTLY, "default" access means "anywhere in the same package"
  // ALL fields in objects (including arrays!!!) are initialized
  // to "zero-like" values on memory allocation
  public String name = "Unknown";
  {
    System.out.println("still initializing... value of name is " + this.name);
  }
  // Java has 8 "primitive" types:
  // boolean (true, false), byte, short (16 bits),
  // char (16 bit unicode-unsigned)
  // int (32 bits), long (64 bits)
  // float (32 bit +/- 2 billion), double (64 bit, 10^300??) -- IEEE 754
  public double gpa;
}

// class Other {}
