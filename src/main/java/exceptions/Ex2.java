package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex2 {
  public static void main(String[] args) throws IOException /* throws BusinessLogicException */ {
    // Java 9, can use final, or "effectively final" as a resource
    /*final*/ BufferedReader br3 = Files.newBufferedReader(Path.of("data.txt"));
//    br3 = null;
    // semicolons SEPARATE resource declarations, can have a trailing semi..
    try (
        br3; // final or effectively final resource...
        // declare and initialize NEW variable for each (Java 7+)
        // MUST BE AutoCloseable
        BufferedReader br2 = Files.newBufferedReader(Path.of("data.txt"));
        BufferedReader br = Files.newBufferedReader(Path.of("data.txt"));
    ) {

      // other stuff going on
      // throw Business logic exception -- this time, this escapes properly
    } catch (IOException fnfe) {

    } finally {
      System.out.println("CAN have a finally too, will execute AFTER the compiler generated one");
    }

    // in "regular" try MUST have either (or both) of catch / finally
    // in try-with-resources having neither is permitted

    // In scope if used just varname
    System.out.println(br3);
  }
}
