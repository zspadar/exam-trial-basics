import java.util.*;

public class PirateCounter{
  public static void main(String... args){
    ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

    // Given this list of hashmaps...

    Map<String, Object> row0 = new HashMap<String, Object>();
    row0.put("name", "Olaf");
    row0.put("has_wooden_leg", false);
    row0.put("gold", 12);
    map.add( row0 );

    Map<String, Object> row1 = new HashMap<String, Object>();
    row1.put("name", "Uwe");
    row1.put("has_wooden_leg", true);
    row1.put("gold", 9);
    map.add( row1 );

    Map<String, Object> row2 = new HashMap<String, Object>();
    row2.put("name", "Jack");
    row2.put("has_wooden_leg", true);
    row2.put("gold", 16);
    map.add( row2 );

    Map<String, Object> row3 = new HashMap<String, Object>();
    row3.put("name", "Morgan");
    row3.put("has_wooden_leg", false);
    row3.put("gold", 17);
    map.add( row3 );

    Map<String, Object> row4 = new HashMap<String, Object>();
    row4.put("name", "Hook");
    row4.put("has_wooden_leg", true);
    row4.put("gold", 20);
    map.add( row4 );

    // Write a function that takes any list that contains pirates as in the example,
    // And returns a list of names containing the pirates that
    // - have wooden leg and
    // - have more than 15 gold
  }
}
