import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by zsuzsanna.padar on 2017. 04. 10..
 */
public class CountAs {
  public static void main(String[] args) {
    final String FILE_NAME = "aFile.txt";
    Path path = Paths.get(FILE_NAME);
    try {
      

    } catch (Exception e){
      System.out.println("No such file exsists - your result is 0");
    }
    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result
  }
}
