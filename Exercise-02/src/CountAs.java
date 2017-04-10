import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 10..
 */
public class CountAs {
  public static void main(String[] args) throws Exception {
    final String FILE_NAME = "aFile.txt";
    countAsInFile(FILE_NAME);

    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result
  }
  public static void countAsInFile(String FILE_NAME) {
    Path path = Paths.get(FILE_NAME);
    try {
      List<String> lines = Files.readAllLines(path);
      String contentOfFile = String.join(".",lines);
      int aCounter = 0;
      char letterA = 'a';
      while (aCounter < lines.size()) {
        for (int i = 0; i < contentOfFile.length(); i++) {
          if ((contentOfFile.charAt(aCounter) == letterA)) {
          } else {
            letterA++;
          }
          aCounter++;
        }
        System.out.println(aCounter);
      }
    } catch (Exception e){
      System.out.println("No such file exists - your result is 0");
    }
  }

}
