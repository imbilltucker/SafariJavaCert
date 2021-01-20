package methodres;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
  public static void showThings(int ... x) {
    System.out.print("the ints are ");
    for (int i : x) System.out.print(i);
    System.out.println();
  }
//  public static void showThings(int x) {
//    System.out.println("the int x is " + x);
//  }
//  public static void showThings(Integer x) {
//    System.out.println("the Integer x is " + x);
//  }
//  public static void showThings(long x) {
//    System.out.println("the long x is " + x);
//  }
  public static void showThings(int x, long y) {
    System.out.println("the int x is " + x + " long y is " + y);
  }
  public static void showThings(long x, int y) {
    System.out.println("the long x is " + x);
  }

  /*
  A) compiles/works
  B) nope!
  public static int showThings(int x) {
    sout something interesting...
    return 1;
  }
   */

  public static void main(String[] args) {
    showThings(9);
//    int res = showThings(10);
    List<String> ls = new ArrayList<>();
    /*boolean success = */ls.add("Fred");
//    showThings(9, 10L);
  }

}
