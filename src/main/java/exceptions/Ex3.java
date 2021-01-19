package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex3 {
  public static void main(String[] args) /* throws BusinessLogicException */{
    BufferedReader br = null;
    try {
      br = Files.newBufferedReader(Path.of("data.txt"));

      // other stuff going on
      // throw Business logic exception
    } catch (IOException fnfe) {

    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        } // YUKKKIE!!!
      }
    }
  }
}
