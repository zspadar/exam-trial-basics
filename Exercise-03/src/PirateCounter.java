import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 10..
 */
public class PirateCounter {
  static class Pirate {
    String name;
    boolean hasWoodenLeg;
    int gold;



    Pirate(String name, boolean hasWoodenLeg, int gold) {
      this.name = name;
      this.hasWoodenLeg = hasWoodenLeg;
      this.gold = gold;
    }

    public String getName() {
      return name;
    }

    public boolean isHasWoodenLeg() {
      return hasWoodenLeg;
    }

    public int getGold() {
      return gold;
    }
  }

  public static void main(String... args){
    ArrayList<Pirate> pirates = new ArrayList<>();
    legAndGoldCounter(pirates);

    // Given this list...

    pirates.add(new Pirate("Olaf", false, 12);
    pirates.add(new Pirate("Uwe", true, 9);
    pirates.add(new Pirate("Jack", true, 16);
    pirates.add(new Pirate("Morgan", false, 17);
    pirates.add(new Pirate("Hook", true, 20);

    // Write a function that takes any list that contains pirates as in the example,
    // And returns a list of names containing the pirates that
    // - have wooden leg and
    // - have more than 15 gold
  }

  public legAndGoldCounter(List<Pirate> list){
    List<Pirate> myList = new ArrayList<>();
    if (getClass().getGold() > 15 && getClass().getisHasWoodenLeg() == true) {
      return myList = getClass().getName();
    }


  }

}
