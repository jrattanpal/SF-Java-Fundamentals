package implementingstuff;

import java.util.Arrays;
import java.util.List;

interface Photographer {
  /*public abstract */void takePhoto(String subject);
}

class ProfessionalPhotographer implements Photographer {
  @Override
  public void takePhoto(String subject) {
    System.out.println("Click, lovely picture of "
        + subject + " and here's the bill");
  }

  public static ProfessionalPhotographer getOne() {
    return new ProfessionalPhotographer();
  }
}

class SpySatellite implements Photographer {
  @Override
  public void takePhoto(String subject) {
    System.out.println("bleep bleep bleep, click, oh look I can see" +
        " your license plate!");
  }
  public void launch() {
    System.out.println("Roar, lots of flame and a smell of burning hydazine");
  }
}

class TryThisStuff {
  public static void tryToLaunch(Photographer p) {
//    if (p instanceof SpySatellite ss1) {
//      if here, ss1 is initialized, is a SpySatellite reference, and all is good
//    }

    if (p instanceof SpySatellite) {
      SpySatellite ss1 = (SpySatellite)p;
      ss1.launch();
    }
    p.takePhoto("My kids");
  }

  public static void main(String[] args) {
//    Photographer p = new ProfessionalPhotographer();
    Photographer p = ProfessionalPhotographer.getOne();
    p.takePhoto("My kids");
    p = new SpySatellite();
    if (p instanceof SpySatellite) {
      SpySatellite ss1 = (SpySatellite)p;
      ss1.launch();
    }
    SpySatellite ss = new SpySatellite();
    ss.launch();
    p.takePhoto("Your kids");

    System.out.println("------------");
    tryToLaunch(new ProfessionalPhotographer());
    System.out.println("------------");
    tryToLaunch(new SpySatellite());
    System.out.println("------------");
    List<Photographer> lp = Arrays.asList(
        new ProfessionalPhotographer(),
        new SpySatellite(),
        new ProfessionalPhotographer());
    for (Photographer p1 : lp) {
      p1.takePhoto("My kids");
    }
  }
}
