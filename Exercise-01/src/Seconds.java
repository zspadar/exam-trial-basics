import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 10..
 */
public class Seconds {
  public static void main(String[] args) {
    List<Integer> myList = new ArrayList<>();
    myList.add(1);
    myList.add(2);
    myList.add(3);
    myList.add(4);
    myList.add(5);
    System.out.println(myList);

    listEverySecondElement(myList);
  }

  public static List<Integer> listEverySecondElement(List<Integer> myList) {
    List<Integer> list = new ArrayList<>();
    for(int i = 2; i < list.size(); i += 2) {
      System.out.println(String.valueOf(list.get(i)));
    }
    return list;
  }
}
