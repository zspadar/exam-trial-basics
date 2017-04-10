import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 10..
 */
public class Seconds {
  public static void main(String[] args) {
    List<String> myList = new ArrayList<>();
    myList.add("1");
    myList.add("2");
    myList.add("3");
    myList.add("4");
    myList.add("5");
    System.out.println(myList);

    listEverySecondElement(myList);
  }

  static void listEverySecondElement(List<String> myList) {
    List<String> list = new ArrayList<>();
    String convertedString = String.join(",",list);
    for(int i = 0; i < convertedString.length(); i += 2) {
      System.out.println(String.valueOf(list.get(convertedString.charAt(i)) + ","));
    }
  }
}
