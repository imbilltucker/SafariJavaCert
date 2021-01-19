package exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class MultiCatch {

  public static void main(String[] args) {
    try {
      if (Math.random() > 0.5) {
        throw new SQLException();
      }
      if (Math.random() > 0.5) {
        throw new IOException();
      }
      // MUST be siblings (not parent/child)
    } catch (IOException | SQLException e) {
      e.printStackTrace();
    }
//    } catch (SQLException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
  }
}
