package exceptions;

import java.sql.SQLException;

public class Ex1 {
  public static void main(String[] args) throws SQLException {
    try {
      if (Math.random() > 0.5) {
//        throw new RuntimeException("Ouch, too big");
        throw new SQLException("DB Broke");
      }
      System.out.println("not too big");
//    } catch (SQLException se) {
//      System.out.println("SQL...");
    } catch (ArithmeticException ae) {
      System.out.println("got an ArithmeticException");
    } catch (RuntimeException re) {
      System.out.println("got a RuntimeException");
    } finally { // guaranteed to start finally if you enter the try
//      System.exit(0); // mightnot finish :) could throw new exception too..
      System.out.println("In finally");
    }
    System.out.println("Still going");
  }
}
